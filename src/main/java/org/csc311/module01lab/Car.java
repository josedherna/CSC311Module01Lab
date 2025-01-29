package org.csc311.module01lab;

public class Car extends Vehicle {
    //Attributes
    private String brand;

    //Constructor
    Car(String make, int carWheels, String carColor, float carEngine, String carFuelType) {
        super(carWheels, carColor, carEngine, carFuelType);
        this.brand = make;
    }

    //Additional Methods
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("[Car Information]");
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Car Engine: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
    }
}
