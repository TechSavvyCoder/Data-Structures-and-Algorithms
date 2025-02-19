import java.util.Arrays;

public class MyList<Book> implements ListInterface<Book> {
	private Book[] list;
	private int numberOfEntries;
	private boolean integrityOK;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	
	public MyList() {
		this(DEFAULT_CAPACITY);
	}

	public MyList(int initialCapacity) {
		// TODO Auto-generated constructor stub
		
		integrityOK = false;
		
		if (initialCapacity < DEFAULT_CAPACITY) {	// Is initialCapacity too small?
			initialCapacity = DEFAULT_CAPACITY;
		} else {									// Is initialCapacity too big?
			checkCapacity(initialCapacity);
		}
		
		// The cast is safe because the new array contains null entries
		@SuppressWarnings("unchecked")
		Book[] tempList = (Book[])new Object[initialCapacity + 1];
		list = tempList;
		numberOfEntries = 0;
		integrityOK = true;
	}
	
	/** check whether capacity is not more than the Max capacity */
	private void checkCapacity(int capacity) {
		if (capacity > MAX_CAPACITY) {
			throw new IllegalStateException("Attempt to create a list whose capacity exceeds " + "allowed maximum of " + MAX_CAPACITY);
		}
	}
	
	private void checkIntegrity() {
		if(!integrityOK) {
			throw new SecurityException("Array object is corrupt.");
		}
	}
	
	/** Ensure whether the array has enough to store new entries */
	private void ensureCapacity() {
		int capacity = list.length - 1;
		
		if(numberOfEntries >= capacity) {
			int newCapacity = 2 *  capacity;
			checkCapacity(newCapacity); 	// Is capacity too big?
			list = Arrays.copyOf(list, newCapacity + 1);
		}
	}
	
	/** Makes room for a new entry to be added */
	private void makeRoom(int givenPosition) {
		for(int index=numberOfEntries; index >= givenPosition; index--) {
			list[index + 1] = list[index];
		}
	}
	
	/** Shifts entries */
	private void removeGap(int givenPosition) {
		for(int index=givenPosition; index < numberOfEntries; index++) {
			list[index] = list[index + 1];
		}
	}

	@Override
	public void add(Book newEntry) {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		list[numberOfEntries + 1] = newEntry;
		numberOfEntries++;
		ensureCapacity();
		
		// ALTERNATIVE CODE
		// add(numberOfEntries + 1, newEntry);
	}

	/** Display Books */
	public void displayBooks() {
		System.out.println("+------+----------------------+--------------------+------------------+----------------------+");
		System.out.printf("| %-4s | %-20s | %-18s | %-16s | %-20s |\n", "No", "Title", "Author", "Publication Year", "ISBN");
		System.out.println("+------+----------------------+--------------------+------------------+----------------------+");
		
        for (int i = 1; i <= numberOfEntries; i++) {
            System.out.printf("| %-4s | %-74s", i, list[i] + "\n");
        }
        System.out.println("+------+----------------------+--------------------+------------------+----------------------+");
    }
	
	@Override
	public void add(int newPosition, Book newEntry) {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		if((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
			if(newPosition <= numberOfEntries) {
				makeRoom(newPosition);
			}
			list[newPosition] = newEntry;
			numberOfEntries++;
			ensureCapacity();
		} else {
			throw new IndexOutOfBoundsException("Given position to add's new entry is out of bounds");
		}
	}

	@Override
	public Book remove(int givenPosition) {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		if((givenPosition >= 1) && givenPosition <= numberOfEntries) {
			Book result = list[givenPosition];	// Get entry to be removed
			
			// Move the entries towards entry to be removed unless it is last in list
			if(givenPosition < numberOfEntries) {
				removeGap(givenPosition);
			}
			list[numberOfEntries] = null;
			numberOfEntries--;
			return result;	// Return reference to removed entry
		} else {
			throw new IndexOutOfBoundsException("Illegal position given to remove operation");
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		for(int index=1; index <= numberOfEntries; index++) {
			list[index] = null;
		}
		numberOfEntries = 0;
	}

	@Override
	public Book replace(int givenPosition, Book newEntry) {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
			Book originalEntry = list[givenPosition];
			list[givenPosition] = newEntry;
			return originalEntry;
		} else {
			throw new IndexOutOfBoundsException("Illegal position given to replace operation");
		}
	}

	@Override
	public Book getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
			return list[givenPosition];
		} else { 
			throw new IndexOutOfBoundsException("Illegal position given to getEntry operation");
		}
	}

	@Override
	public Book[] toArray() {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		
		// The cast is safe because the new array contains null entries
		@SuppressWarnings("unchecked")
		Book[] result = (Book[])new Object[numberOfEntries]; // Unchecked cast
		for (int index = 0; index < numberOfEntries; index++) {
			result[index] = list[index + 1];
		}
		
		return result;
	}

	@Override
	public boolean contains(Book anEntry) {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		boolean found = false;
		int index = 1;
		while(!found && (index <= numberOfEntries)) {
			if(anEntry.equals(list[index])) {
				found = true;
			}
			index++;
		}
		
		return found;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		
		return numberOfEntries;
	}

	@Override
	public void sortAList() {
		// TODO Auto-generated method stub
		
		checkIntegrity();
		Arrays.sort(list, 1, numberOfEntries + 1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return numberOfEntries == 0;	// Or getLength() == 0
	}
	
}
