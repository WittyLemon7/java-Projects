# Bank Account class
## Problem Statement
Create a `BankAccount` class that allows users to create bank accounts, deposit and withdraw money, and check their balance. This should also associate account numbers to their customer details.
## Discussion
The `BankAccount` class is designed to manage bank accounts, allowing users to perform basic banking operations such as depositing and withdrawing money, checking their balance, and associating account numbers with customer details. This class encapsulates the properties and behaviors of a bank account, providing a clear interface for users to interact with their accounts.
## Walkthrough
```java
package dev.projects.ClassesChallenge;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor chaining
    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    //constructor
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //overloaded constructor
    public BankAccount(String phoneNumber, String email, String customerName) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerName = customerName;
    }

    //deposit method
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    //withdrawal method
    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }
    //getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
```
## Logic & Explanation
- **`Constructor chaining`** is used to call another constructor within the same class, allowing for default values to be set when no parameters are provided.
- The class has multiple constructors to allow for flexibility in creating bank accounts with different initial values.
- **`Overload Constructor`** allows creating a bank account with just customer details, setting a default account number and balance.
- The `deposit` method increases the account balance by the specified amount and prints the new balance.
- The `withdrawal` method checks if there are sufficient funds before processing the withdrawal, ensuring that the balance does not go negative. If funds are insufficient, it prints a message indicating the available balance.
- `getters & setters` are provided for accessing and modifying the account properties, allowing encapsulation of the class data while providing controlled access.
## ⚠️Edge Cases
-`null or empty values` for customer details should be handled to ensure valid account creation.
- **Negative Deposit or Withdrawal**: Ensure that deposit amounts are positive and withdrawals do not exceed the current balance.
- **Invalid Account Number**: Handle cases where the account number is not in a valid format or is null.

## Related Concepts
- **[[Encapsulation]]**: The class encapsulates the properties and behaviors of a bank account, providing a clear interface for users to interact with their accounts.
- **[[Constructor Overloading]]**: The class demonstrates constructor overloading by providing multiple constructors with different parameters to create bank accounts in various ways.