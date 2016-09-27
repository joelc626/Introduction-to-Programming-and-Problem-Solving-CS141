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

public class PoliceOfficer {
    private String name;
    private String badgeNumber;
    
    public PoliceOfficer(String m, String bn) {
        name = m;
        badgeNumber = bn;
    }
    
    public PoliceOfficer(PoliceOfficer officer2) {
        name = officer2.name;
        badgeNumber = officer2.badgeNumber;
    }
    
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        //To reference the ticket
        ParkingTicket ticket = null;
        
        int illegalMinutes = car.getMinutes() - meter.getMinutesPurchased();
        
        //If car is illegaly parked then ticket is assigned
        if(illegalMinutes > 0)
            ticket = new ParkingTicket(car, this, illegalMinutes);
        return ticket;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setBadgeNumber(String b) {
        badgeNumber = b;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBadgeNumber() {
        return badgeNumber;
    }
    
    public String toString() {
        String string =  "Name: " + name
        + "\nBadgeNumber: " + badgeNumber;
        return string;
    }
}