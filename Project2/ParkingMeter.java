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

public class ParkingMeter {
    private int minutesPurchased;
    
    public ParkingMeter(int m) {
        minutesPurchased = m;
    }
    
    public void setMinutesPurchased(int m) {
        minutesPurchased = m;
    }
    
    public int getMinutesPurchased() {
        return minutesPurchased;
    }
    
}