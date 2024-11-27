package model;

import java.util.Objects;

/**
 * This class defines a username and the user's email
 *
 */
public class User {

    //Encapsulated fields for user details

    private String userName;
    private String email;

    public User(){}

    //Constructor to initialize user details
    public User(String userName, String email){
        this.userName = userName;
        this.email = email;
    }

    /**
     * Method displays User details
     */
    public void displayDetails(){
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
    }






    //Getters and Setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) && Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getEmail());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

