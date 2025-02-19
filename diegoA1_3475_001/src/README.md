# Assignment 1

## Part a: (User-defined list)
Create an interface **ListInterface** with the following methods
* add(newEntry): Adds a new entry to the end of the list.
* add(newPosition, newEntry): Adds a new entry to the list at a given position.
* remove(givenPosition): Removes the entry at a given position from the list.
* clear(): Removes all entries from the list.
* replace(givenPosition, newEntry): Replaces the entry at a given position in the list with a given entry.
* getEntry(givenPosition): Retrieves the entry at a given position in the list.
* toArray(): Retrieves all entries in the list in their current order.
* contains(anEntry): Sees whether the list contains a given entry.
* getLength(): Gets the number of entries in the list
* sortAList(): sort the list
* isEmpty(): Sees whether the list is empty

Create a **MyList** class (user-defined) that implements ListInterface mentioned above. The program is to work with a List ADT using a fixed size array (that can be resized) approach

## Part b: (Library Book Manager Application using MyList class created in Part a)
You are tasked with creating a simple **Library Book Manager** application that allows a user to manage a library book collection using the MyList created in part a. The application should provide the following functionalities:

* Add a Book: Allow the user to input a book information (title, author, publication year and ISBN) and add it to the list of books.
* View all Books: Display all books currently stored in the list, showing their positions (1-indexed) and details.
* Remove a Book: Allow the user to remove a book by entering its position in the list. If the user enters an invalid position, display an error message.
* Remove all Books: Remove all books from the list.
* Update a Book: Allow the user to update the details of a book by entering its position. Prompt the user for new details (title, author, publication year and ISBN) and use the replace method to update the book.
* Sort the Books: Ask the user whether to sort by author or by publication year. Sort the list accordingly and display the sorted list to the user. Use any of the sorting algorithm which are discussed in class.
* Exit: End the application.

The program should continuously display the menu until the user chooses to exit. For each option on the menu, execute the necessary operation and display the output

**Hints**: Create additional classes if needed