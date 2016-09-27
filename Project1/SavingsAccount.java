/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 1 - Savings Account
 * Driver: SavingsAccountTestFiles.java
 *
 * Purpose: Store saving account’s annual interest rate and balance
 * Objective: Be able to write a class with constructors, void and
 * value-returning instance methods.
 * To be able to instantiate and interact with the object of the created class.
 * To review File I/O.
 */

public class SavingsAccount {
    private double balance;
    private double interestRate;
    
    //Constructor accepts the annual interest rate
    //and amount of the savings account starting balance
    public SavingsAccount(double bal, double intRate) {
        balance = bal;
        interestRate = intRate;
    }
    
    //The withdraw method subtracts from the balance
    public void withdraw(double amount) {
        balance -= amount;
    }
    
    //The deposit method adds from the balance
    public void deposit(double amount) {
        balance += amount;
    }
    
    //The addInterest adds the interest earned to the balance
    public void addInterest() {
        balance += interestRate;
    }
    
    //The getBalance method simply returns the balance
    public double getBalance() {
        return balance;
    }
    
    //The getInterestRate method returns the interest rate
    public double getInterestRate() {
        interestRate = balance * interestRate / 12;
        return interestRate;
    }
}