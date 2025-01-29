package org.csc311.module01lab;

public class Main {
    public static void main(String[] args) {
        Vehicle testVehicle = new Vehicle(4, "Silver", 3.0f, "Gasoline");
        Car testCar = new Car("Toyota", 4, "Blue", 2.4f, "Gasoline");
        //Testing Vehicle getter methods
        System.out.println("[Initial Vehicle Information]");
        System.out.println(testVehicle.getNumberOfWheels());
        System.out.println(testCar.getColor());
        System.out.println(testVehicle.getEngineSize());
        System.out.println(testVehicle.getFuelType());
        System.out.println();

        //Testing Vehicle setter methods
        testVehicle.setNumberOfWheels(10);
        testVehicle.setColor("Red");
        testVehicle.setEngineSize(18.0f);
        testVehicle.setFuelType("Diesel");

        //Checking updated vehicle attributes
        System.out.println("[Updated Vehicle Information]");
        System.out.println(testVehicle.getNumberOfWheels());
        System.out.println(testCar.getColor());
        System.out.println(testVehicle.getEngineSize());
        System.out.println(testVehicle.getFuelType());
        System.out.println();

        //Testing Car methods
        testCar.displayInfo();
        System.out.println();
        testCar.honk();
    }
}