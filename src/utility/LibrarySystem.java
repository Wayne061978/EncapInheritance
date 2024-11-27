package utility;

import model.AdminUser;
import model.Book;
import model.LibraryUser;

public class LibrarySystem {
     //Create an admin user
    AdminUser admin = new AdminUser("John", "john@gmail.com");

    //Creating Book objects
    Book book1 = new Book("Java Fundamentals", "Lewis", 10);
    Book book2 = new Book("Python Fundamentals", "Grace", 5);
    Book book3 = new Book("C++ Fundamentals", "John", 7);



    /**
     * Admin adds books to the library inventory and displays books
     */
    public void runLibrarySystem(){
        admin.addBook(book1);
        admin.addBook(book2);
        admin.addBook(book3);

        //Admin views the library inventory
        admin.viewInventory();

        //Admin removes a book from the inventory
      //  admin.removeBook("C++ Fundamentals");

      //  admin.viewInventory();


    }


      LibraryUser libraryUser = new LibraryUser("Jane", "jane@gmail.com");

    /**
     * Library user services , borrow and return book
     */
    public void useLibraryServiceForUser(){

        //User borrows books
        libraryUser.borrowBook(book1);
        libraryUser.borrowBook(book2);
        libraryUser.borrowBook(book3);

        //Display libraryUser details with borrowed books
        System.out.println("\n LibraryUser Details: ");
        libraryUser.displayDetails();

        //LibraryUser returns a book
        libraryUser.returnBook(book2);

        //Display LibraryUser details after returning a book
        System.out.println("\nLibraryUser Details after returning a Book: ");
        libraryUser.displayDetails();

    }


}
