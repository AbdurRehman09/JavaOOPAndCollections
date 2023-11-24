/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Abdul Rehman
 */
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    // Constructor to initialize the account details
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting it to 0.");
            this.accountBalance = 0;
        } else {
            this.accountBalance = initialBalance;
        }
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.accountBalance >= amount) {
                this.accountBalance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds. Cannot withdraw.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    // Method to display the account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}
public class task1 {
     public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount myAccount = new BankAccount(123456, "John Doe", 1000.0);

        // Displaying initial account details
        System.out.println("Initial Account Details:");
        myAccount.displayAccountDetails();

        // Performing deposit and withdrawal operations
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        myAccount.displayAccountDetails();
    }
    
}
