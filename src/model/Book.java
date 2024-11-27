package model;


public class Book {

    //fields
    private String title;
    private String author;
    private int availableCopies;

    //Constructor
    public Book(String title, String author, int availableCopies){
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }


    /**
     * Method checks out library book
     * @return
     */
    public boolean borrowBook(){
         if(availableCopies > 0){
             availableCopies--;
             return true;
         }
         return false;
    }

    public void returnBook(){
        availableCopies++;
    }

    //getters/setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availableCopies=" + availableCopies +
                '}';
    }
}
