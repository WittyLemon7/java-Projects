package dev.projects.LMSManagement;

public class User {

    //protected fields to be accessed by subclasses
    protected String username;
    protected String password;
    protected String email;

    //constructor
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void login() {
        System.out.println(username + " is logged in");
    }
    public void logout() {
        System.out.println(username + " is logged out");
    }
    //toString method

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
