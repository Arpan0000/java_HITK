/*6.Assume that a Bank maintains two kinds of accounts for its customers, one called savings
account and the other current account. The savings account provides compound interest and
withdrawal facilities. The current account provides no interest. Current account holders
should maintain balance and if the balance falls below this level, a service charge is imposed.

    o   Create a class Account that stores customers name, account number and type of the
        account. From this derive the classes CurAccount and SavAccount to make them
        more specific to their requirements.

    o Include the necessary methods in order to achieve the following tasks:
        Assign initial values
        Accept deposit from a customer and update the balance
        Permit withdrawal and update the balance
        Compute and deposit interest
        Check for the minimum balance, impose penalty, if necessary, and update it.
        Display the balance

    o   Write a program that creates an array of Bank Account and displays a menu that lets a
        new account to be created, perform deposit and withdrawal transactions on the basis
        of account number, display the balance of account holder for whom the account
        number is provided.*/

import java.util.*;

class Account{
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Type : " + accountType);
        System.out.println("Current Balance : " + balance);
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New Balance : " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New Balance : " + balance);
        } 
        else
            System.out.println("Insufficient balance or invalid withdrawal amount!");
    }
} 

class SavAccount extends Account{
    double RateOfInterest;
    SavAccount(String customerName, int accountNumber, double balance, double RateOfInterest) {
        super(customerName, accountNumber, "Savings", balance);
        this.RateOfInterest = RateOfInterest;
    }
    void calculateInterest(int month){
        double interest = balance * (RateOfInterest/ 100) * (month / 12.0);
        balance += interest;
        System.out.println("Interest of " + interest + " added for " + month + " months. New Balance: " + balance);
    }
} 

class CurAccount extends Account {
    double minimumBalance;
    double penalty;
    CurAccount(String customerName, int accountNumber, double balance, double minimumBalance, double penalty) {
        super(customerName, accountNumber, "Current", balance);
        this.minimumBalance = minimumBalance;
        this.penalty = penalty;
    }
    
    // Check for minimum balance and impose penalty
    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            System.out.println("Balance below minimum! Imposing penalty of : " + penalty);
            balance -= penalty;
            System.out.println("Balance after penalty : " + penalty);
        }
    }
    
    // for current acc overwrite the withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New Balance : " + balance);
            checkMinimumBalance();
        } 
        else
        System.out.println("Insufficient balance or invalid withdrawal amount!");
    }
}


public class Bankinherit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int i = 0; // acc count

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice=in.nextInt();

            switch (choice) {
                case 1: // Create Account

                    System.out.print("Enter 1 for Savings Account, 2 for Current Account: ");
                    int type = in.nextInt();
                    
                    in.nextLine(); // for input problem
                    System.out.print("Enter Customer Name :    ");
                    String name = in.nextLine();
                    

                    System.out.print("Enter Account Number : ");
                    int accNo = in.nextInt();
                    System.out.println();

                    System.out.print("Enter Initial Deposit : ");
                    double balance = in.nextDouble();
                    System.out.println();

                    if (type == 1) {
                        System.out.print("Enter Interest Rate (per annum): ");
                        double interestRate = in.nextDouble();
                        accounts[i++] = new SavAccount(name, accNo, balance, interestRate);
                        System.out.println("Savings Account created successfully!");
                    }
                    else if (type == 2) {
                        System.out.print("Enter Minimum Balance : ");
                        double minBalance = in.nextDouble();
                        System.out.print("Enter Penalty Amount : ");
                        double penalty = in.nextDouble();
                        accounts[i++] = new CurAccount(name, accNo, balance, minBalance, penalty);
                        System.out.println("Current Account created successfully!");
                    } 
                    else
                        System.out.println("Invalid account type!");
                    break;

                case 2: // Deposit

                    System.out.print("Enter Account Number : ");
                    int depositAccNo = in.nextInt();
                    System.out.println();

                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = in.nextDouble();
                    System.out.println();

                    boolean accountFound = false;//existising acc checker

                    for (Account acc : accounts) {
                        if (acc != null && acc.accountNumber == depositAccNo) {
                            acc.deposit(depositAmount);
                            accountFound = true;
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3: // Withdraw

                    System.out.print("Enter Account Number : ");
                    int withdrawAccNo = in.nextInt();
                    System.out.println();

                    System.out.print("Enter Amount to Withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    System.out.println();

                    accountFound = false;
                    for (Account acc : accounts) {
                        if (acc != null && acc.accountNumber == withdrawAccNo) {
                            acc.withdraw(withdrawAmount);
                            accountFound = true;
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4: // Display Balance
                    System.out.print("Enter Account Number : ");
                    int displayAccNo = in.nextInt();
                    System.out.println();

                    accountFound = false;
                    for (Account acc : accounts) {
                        if (acc != null && acc.accountNumber == displayAccNo) {
                            acc.displayBalance();
                            accountFound = true;
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Thank you for using the Bank Application!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}