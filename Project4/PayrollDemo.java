/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 4 - Payroll
 * Driver: PayrollDemo.java
 *
 * Purpose: Practie custom exceptions.
 * Objective: Be able to create and use custom exception class.
 */

import java.util.*;

public class PayrollDemo {
    public static void main(String[] args) {
        Payroll worker;
        
        //Create a Payroll object with an empty string for the name.
        try {
            worker = new Payroll("", 123);
        }
        catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
        
        // Create a Payroll object with an invalid ID number.
        try {
            worker = new Payroll("Bill Jenkins", -99);
        }
        
        catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
        
        //Try to set an invalid hourly pay rate.
        try {
            worker = new Payroll("Bill Jenkins", 123);
            worker.setPayRate(150.0);
        }
        
        catch(InvalidHourlyRateException e) {
            System.out.println("Error - " + e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
        
        //Try to set an invalid number of hours worked.
        try {
            worker = new Payroll("Bill Jenkins", 123);
            worker.setHoursWorked(-10);
        }
        
        catch(InvalidHoursException e) {
            System.out.println("Error - " + e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
    }
}