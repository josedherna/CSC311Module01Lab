package org.csc311.module01lab;

public class Vehicle {
    //Attributes
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    //Constructor
    Vehicle(int vehicleWheels, String paintColor, float vehicleEngine, String vehicleFuel) {
        numberOfWheels = vehicleWheels;
        color = paintColor;
        engineSize = vehicleEngine;
        fuelType = vehicleFuel;
    }

    //Getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    //Setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
