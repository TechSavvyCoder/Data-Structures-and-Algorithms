
public interface ListInterface<Book> {
	/** Adds new entry at the end of the list */
	public void add(Book newEntry);
	
	/** Adds a new entry at a specified  position within this list */
	public void add(int newPosition, Book newEntry);
	
	/** Removes the entry at a given position from this list */
	public Book remove(int givenPosition);
	
	/** Removes all entries from the list */
    public void clear();
    
    /** Replaces the entry at a given position in this list */
    public Book replace(int givenPosition, Book newEntry);
    
    /** Retrieves the entry at a given position in this list */
    public Book getEntry(int givenPosition);
    
    /** Retrieves all entries that are in this list in the order in which they occur in the list */
    public Book[] toArray();
    
    /** Sees whether this list contains a given entry */
    public boolean contains(Book anEntry);
    
    /** Gets the length of this list */
    public int getLength();
    
    /** Sorts the list */
    public void sortAList();
    
    /** Sees whether this list is empty */
    public boolean isEmpty();
}
