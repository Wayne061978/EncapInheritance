package model;

import java.util.ArrayList;

public class LibraryUser extends User{

    private ArrayList<Book> borrowedBooks;  //delcared arraylist

    //Constructor to initialize the library user
    public LibraryUser(String userName, String email){
        super(userName, email);  //call to parent class constructor
        this.borrowedBooks = new ArrayList<>();  //Initializing the borrowed books

    }


    /**
     * Method to borrow a book
     * @param book
     */
    public void borrowBook(Book book){
      if(book.borrowBook()){
          borrowedBooks.add(book); //Add the book to the borrowed list
          System.out.println("You borrowed: " + book.getTitle());
      }else {
          System.out.println("Sorry " + book.getTitle() + " is not available.");
      }
    }

    /**
     * Method returns a book
     * @param book
     */
    public void returnBook(Book book){
        if(borrowedBooks.remove(book)){
            book.returnBook(); //Update the book's availability
            System.out.println("You returned " + book.getTitle());
        }else{
            System.out.println("This book is not in your borrowed list. ");
        }
    }

    /**
     * Displays LibraryUser borrowed books details
     */
    @Override
    public void displayDetails(){
        super.displayDetails();  //Invoking the parent class method
        System.out.println("Borrowed Books: ");
        for(Book book : borrowedBooks){
            System.out.println("-" + book.getTitle());
        }
    }








}
