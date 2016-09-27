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

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;
    
    public ParkedCar(String mk, String mod, String col, String lic, int min) {
        make = mk;
        model = mod;
        color = col;
        licenseNumber = lic;
        minutesParked = min;
    }
    
    public ParkedCar(ParkedCar car2) {
        make = car2.make;
        model = car2.model;
        color = car2.color;
        licenseNumber = car2.licenseNumber;
        minutesParked = car2.minutesParked;
    }
    
    public void setMake(String m) {
        make = m;
    }
    
    public void setModel(String m) {
        model = m;
    }
    
    public void setLicenseNumber(String lic) {
        licenseNumber = lic;
    }
    
    public void setMinutesParked(int m) {
        minutesParked = m;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }
    
    public int getMinutes() {
        return minutesParked;
    }
    
    public String toString() {
        String string = "Make: " + make
        + "\nModel: " + model
        + "\nColor: " + color
        + "\nLicense Number: " + licenseNumber
        + "\nMinutes Parked: " + minutesParked;
        return string;
    }
    
}