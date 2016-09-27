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

import java.util.*;
import java.io.*;

public class SavingsAccountTestFiles {
    public static void main(String[] args) throws Exception {
        double intRate;
        double num;
        File fromFile;
        Scanner from;
        
        Scanner kb = new Scanner(System.in);
        
        //Get interest rate
        System.out.println();
        System.out.print("Enter the savings account's annual interest rate: ");
        intRate = kb.nextDouble();
        
        //Send and store the beginning balance and interest rate
        SavingsAccount savAcc = new SavingsAccount(500.00, intRate);
        
        //Read numbers from Withdrawals.txt and send them to the class
        fromFile = new File("Withdrawals.txt");
        from = new Scanner(fromFile);
        
        while(from.hasNext()) {
            num = from.nextDouble();
            savAcc.withdraw(num);
        }
        
        //Read numbers from Deposits.txt and send them to the class
        fromFile = new File("Deposits.txt");
        from = new Scanner(fromFile);
        
        while(from.hasNext()) {
            num = from.nextDouble();
            savAcc.deposit(num);
        }
        
        //Display interest earned
        System.out.println();
        System.out.printf("Interest earned: $%.2f\n\n", savAcc.getInterestRate());
        
        //Adds the interest to the balance
        savAcc.addInterest();
        
        //Display ending balance
        System.out.printf("Ending balance: $%.2f\n", savAcc.getBalance());
    }
    
}