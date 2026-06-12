/*
Create an abstract class Vehicle with properties : vehicleNumber, vehicleName, and fuelType. It should
include an abstract method calculateRange() and a concrete method display() to show basic details.
Create two subclasses : Car and Motorcycle, each with fuelCapacity and mileage. Implement the
calculateRange() method using the formula :
Range=fuelCapacityxmileage
Override the display() method to include all details and the calculated range. Write a test class to
demonstrate the functionality of both classes.
 */
abstract class Vehicle {

    private final String vehicleNumber;
    private final String vehicleName;
    private final String fuelType;

    public Vehicle(String vehicleNumber, String vehicleName, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.fuelType = fuelType;
    }

    @SuppressWarnings("unused")
    abstract void calculateRange();

    void display() {
        System.out.println("Vehicle Number:- " + vehicleNumber);
        System.out.println("Vehicle Name:- " + vehicleName);
        System.out.println("Fuel Type:- " + fuelType);
    }
}

class Motorcycle extends Vehicle {

    private final double fuelCapacity;
    private final double mileage;

    public Motorcycle(String vehicleNumber, String vehicleName, String fuelType, double fuelCapacity, double mileage) {
        super(vehicleNumber, vehicleName, fuelType);
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    @Override
    void calculateRange() {
        double range = fuelCapacity * mileage;
        System.out.println("Range:- " + range);
    }
}

class Car extends Vehicle {

    private final double fuelCapacity;
    private final double mileage;

    public Car(String vehicleNumber, String vehicleName, String fuelType, double fuelCapacity, double mileage) {
        super(vehicleNumber, vehicleName, fuelType);
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    @Override
    void calculateRange() {
        double range = fuelCapacity * mileage;
        System.out.println("Range:- " + range);
    }
}

public class Test {

    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle("WB 21 AB 1234", "TATA Safari", "Petrol", 10, 25);
        motorcycle.display();
        motorcycle.calculateRange();
        System.out.println("\n");
        Car car = new Car("WB 12 AB 1134", "TATA Sierra", "Petrol", 15, 20);
        car.display();
        car.calculateRange();

    }
}
