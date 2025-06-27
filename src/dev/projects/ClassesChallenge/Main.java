package dev.projects.ClassesChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount johnsAccount = new BankAccount("123456789 ",1000,"John Doe","johnd@example.com ","123-456-7890");

        //setting the values for the fields
//        johnsAccount.setAccountNumber("123456789");
//        johnsAccount.setBalance(1000.0);
//        johnsAccount.setCustomerName("John Doe");
//        johnsAccount.setEmail("johndoe@example.com");
//        johnsAccount.setPhoneNumber("123-456-7890");
        //calling the methods
        johnsAccount.withdrawal(100.0);

        johnsAccount.deposit(500.0);
        johnsAccount.withdrawal(100.0);

        johnsAccount.withdrawal(112.49);
        johnsAccount.withdrawal(46.99);

        BankAccount bobsAccount = new BankAccount("Bob","bob@example.com","333 400 7080");
        System.out.println(bobsAccount.getAccountNumber() + " name " + bobsAccount.getCustomerName());





    }

}
