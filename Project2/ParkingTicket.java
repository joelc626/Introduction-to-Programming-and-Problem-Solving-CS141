/* Author: Joel Castro
 * Class: CS 141-02: Data Structures and Algorithms I
 * Assignment: Project 2 - Parking Ticket Simulator
 * Driver: ParkingTicketSimulator.java
 *
 * Purpose: Design a set of classes that work together to simulate a police
 * officer issuing a parking ticket.
 * Objective: Be able to use objects made up of other objects (Aggregation).
 * To be able to write a copy constructor.
 * To be able to write equals and toString methods.
 * To be able to write methods that pass and return objects.
 */

import java.text.*;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;            //The amount of minutes illegaly parked
    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;
    
    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min) {
        //Make copy of the object referenced by aCar, anOfficer
        car = new ParkedCar(aCar);
        officer = new PoliceOfficer(anOfficer);
        
        //Assign the minutes illegally parked
        minutes = min;
        
        calculateFine();
    }
    
    public ParkingTicket(ParkingTicket ticket2) {
        //Make a copy of the object referenced by aCar, anOfficer
        car = new ParkedCar(ticket2.car);
        officer = new PoliceOfficer(ticket2.officer);
        
        fine = ticket2.fine;
    }
    
    public void calculateFine() {
        //Get the time parked in hours
        double hours = minutes / 60.0;
        
        int hoursAsInt = (int)hours;
        
        //Round up if there was a portion of an hour
        if((hours - hoursAsInt) > 0)
            hoursAsInt++;
        fine = BASE_FINE;
        
        //Add the additional hourly fines
        fine += (hoursAsInt * HOURLY_FINE);
    }
    
    public void setCar(ParkedCar c) {
        //Make a copy of the object referenced by c
        car = new ParkedCar(c);
    }
    
    public void setOfficer(PoliceOfficer o) {
        //Make a copy of the object referenced by o
        officer = new PoliceOfficer(o);
    }
    
    public ParkedCar getCar() {
        //Return a copy of the car object
        return new ParkedCar(car);
    }
    
    public PoliceOfficer getOfficer() {
        //Return a copy of the officer object
        return new PoliceOfficer(officer);
    }
    
    public double getFine() {
        return fine;
    }
    
    public String toString() {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        String string = "Car Data: \n" + car
        + "\nOfficer Data:\n" + officer
        + "\nMinutes Illegally Parked: " + minutes
        + "\nFine: $" + dollar.format(fine);
        return string;
    }
}