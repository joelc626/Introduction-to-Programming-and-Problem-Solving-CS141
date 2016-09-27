/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 4 - Payroll
 * Driver: PayrollDemo.java
 *
 * Purpose: Practie custom exceptions.
 * Objective: Be able to create and use custom exception class.
 */

public class InvalidHoursException extends Exception {
    public InvalidHoursException(double hours) {
        super("Invalid number of hours: " + hours);
    }
}