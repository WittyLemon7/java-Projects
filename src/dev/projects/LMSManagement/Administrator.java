package dev.projects.LMSManagement;

public class Administrator extends User {

    private  String privileges;

    public Administrator(String username, String password, String email, String privileges) {
        super(username, password, email);
        this.privileges = privileges;
    }
    public void manageUsers() {
        System.out.println(username + " is managing users with privileges " + privileges);
    }
    public void generateReports() {
        System.out.println(username + " is generating reports");
    }
    @Override
    public String toString() {
        return super.toString() + " role: administrator";
    }
}
