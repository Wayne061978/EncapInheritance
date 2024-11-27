package model;

import java.util.ArrayList;

public class AdminUser extends User {

    private ArrayList<Book> libraryInventory;

    //Constructor to initialize admin user
    public AdminUser(String username, String email) {
        super(username, email);
        this.libraryInventory = new ArrayList<>();  //initialize the inventory list
    }

    /**
     * Method adds a book to library inventory
     *
     * @param book
     */
    public void addBook(Book book) {
        libraryInventory.add(book);
        System.out.println(book.getTitle() + " added to the library inventory");
    }

    /**
     * Method removes a book from the library inventory
     *
     * @param title
     */
    public void removeBook(String title) {
        Book toRemove = null;  // create a toRemove Book object and setting its value to empty or null;
        for (Book book : libraryInventory) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                toRemove = book;
                break;
            }
        }
        if (toRemove != null) {
            libraryInventory.remove(toRemove);
            System.out.println(title + " has been removed from the inventory");
        } else {
            System.out.println(title + " is not found in the library inventory");
        }
    }

    /**
     * Method to display all books in the inventory
     */
    public void viewInventory() {
        System.out.println("Library Inventory:");
        for (Book book : libraryInventory) {
            System.out.println(book);
        }


    }
}
