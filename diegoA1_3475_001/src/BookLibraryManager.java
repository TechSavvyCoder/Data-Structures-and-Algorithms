import java.util.*;

public class BookLibraryManager {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList library = new MyList();
		boolean start = true;

		mainMenu();
		while (start) {
            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            	case 0: mainMenu(); break;
                case 1: addBook(library); break;
                case 2: viewBooks(library); break;
                case 3: removeBook(library); break;
                case 4: clearBooks(library); break;
                case 5: updateBook(library); break;
//                case 6 -> sortBooks(library);
                case 7: 
                    System.out.println("\nThank you for using the Book Library Manager! Goodbye!");
                    start = false;
                    break;
                default: System.out.println("\nInvalid option! Please try again.");
            }
        }
		
	}
	
	public static void mainMenu() {
		System.out.println("═══════════════════════════════════════");
        System.out.println("          BOOK LIBRARY MANAGER           ");
        System.out.println("═══════════════════════════════════════");
        System.out.println("\t1 ➤ Add a Book");
        System.out.println("\t2 ➤ View All Books");
        System.out.println("\t3 ➤ Remove a Book");
        System.out.println("\t4 ➤ Remove All Books");
        System.out.println("\t5 ➤ Update a Book");
        System.out.println("\t6 ➤ Sort Books");
        System.out.println("\t7 ➤ Exit");
        System.out.println("═══════════════════════════════════════");
	}
	
	public static void addBook(MyList library) {
		System.out.print("\nEnter Book Title: ");
		String title = scanner.nextLine();
		System.out.print("Enter Author: ");
		String author = scanner.nextLine();
		System.out.print("Enter Publication Year:");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter ISBN: ");
		String isbn = scanner.nextLine();
		
		library.add(new Book(title, author, year, isbn));
		System.out.println("\nBook Added Successfully!");
	}
	
	public static void viewBooks(MyList library) {
		System.out.println("\nList of Books");
		
		if(library.isEmpty()) {
			System.out.println("No books available.");
		} else {
			library.displayBooks();
		}
	}
	
	public static void removeBook(MyList library) {
		if(library.isEmpty()) {
			System.out.println("No books to remove.");
			return;
		}
		
		System.out.print("\nEnter book position to remove: ");
		int position = scanner.nextInt();
		scanner.nextLine();
		library.remove(position);
		System.out.println("\nBook Removed Successfully!");
	}

	public static void clearBooks(MyList library) {
		if(library.isEmpty()) {
			System.out.println("No books to remove.");
			return;
		}
		
		System.out.println("Are you sure you want to remove all books? (yes/no): ");
		String confirmation = scanner.nextLine();
		
		if(confirmation.toLowerCase().equals("yes") || confirmation.toLowerCase().equals("y")) {
			library.clear();
			System.out.println("All Books has been removed.");
		} else {
			System.out.println("Operation Cancelled");
		}
	}
	
	public static void updateBook(MyList library) {
		if(library.isEmpty()) {
			System.out.println("No Books to update.");
			return;
		}
		
		System.out.print("Enter book position to update");
		int position = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("\nEnter new Book Title: ");
		String title = scanner.nextLine();
		System.out.print("Enter new Author: ");
		String author = scanner.nextLine();
		System.out.print("Enter new Publication Year:");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter new ISBN: ");
		String isbn = scanner.nextLine();
		
		library.replace(position, new Book(title, author, year, isbn));
		System.out.println("\nBook "+ position +" has been Updated Successfully!");
	}
}











