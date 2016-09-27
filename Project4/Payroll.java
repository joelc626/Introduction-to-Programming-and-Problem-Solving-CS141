/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 4 - Payroll
 * Driver: PayrollDemo.java
 *
 * Purpose: Practie custom exceptions.
 * Objective: Be able to create and use custom exception class.
 */

import java.lang.*;

public class Payroll {
    private String eMName;
    private int iDNum;
    private double payRate;
    private int hoursWorked;
    
    public Payroll(String e, int iD) throws InvalidNameException, InvalidIDException {
        if (e.equals(""))
            throw new InvalidNameException();
        else
            eMName = e;
        
        if (iD < 1)
            throw new InvalidIDException(iD);
        else
            iDNum = iD;
    }
    
    public void setEmName(String e) throws InvalidNameException {
        if (e.equals(""))
            throw new InvalidNameException();
        else
            eMName = e;
    }
    
    public void setIDNum(int iD) throws InvalidIDException {
        if (iD < 1)
            throw new InvalidIDException(iD);
        else
            iDNum = iD;
    }
    
    public void setHoursWorked(int h) throws InvalidHoursException {
        if (h < 0 || h > 84)
            throw new InvalidHoursException(h);
        else
            hoursWorked = h;
    }
    
    public void setPayRate(double p) throws InvalidHourlyRateException {
        if (p < 0 || p > 25)
            throw new InvalidHourlyRateException(p);
        else
            payRate = p;
    }
    
    public String getEmName() {
        return eMName;
    }
    
    public int getIDNum() {
        return iDNum;
    }
    
    public double getPayRate() {
        return payRate;
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }
}