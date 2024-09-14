/**
 * Matthew Cha
 * Class: Person
 * version 1.0
 * 9/13/2024
 *  Creates an OOP class for Bike
 */
public class Bike {
    private int numberOfWheels;
    private String manufacturer;
    private int year;
    //name of bike 1
    public Bike() {
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    public Bike(int numberOfWheels, String manufacturer, int year) {
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    //getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }
    //setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Bike[numberOfWheels: " + numberOfWheels + ", manufacturer: " + manufacturer + ", year=" + year + "]";
    }
}