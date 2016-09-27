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

public class ParkingTicketSimulator {
    public static void main(String[] args) {
        // Create a ParkedCar object.
        // The car was parked for 125 minutes.
        ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red", "147RHZM", 125);
        
        //Uncomment the following statement to demonstrate. No crimes committed.
        //ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red", "147RHZM", 60);
        
        //Create a ParkingMeter object. 60 minutes were purchased.
        ParkingMeter meter = new ParkingMeter(60);
        
        // Create a PoliceOfficer object.
        PoliceOfficer officer = new PoliceOfficer("Joe Friday", "4788");
        
        // Let the officer patrol.
        ParkingTicket ticket = officer.patrol(car, meter);
        
        // Did the officer issue a ticket?
        if (ticket != null)
            System.out.println(ticket);
        else
            System.out.println("No crimes committed!");
    }
}