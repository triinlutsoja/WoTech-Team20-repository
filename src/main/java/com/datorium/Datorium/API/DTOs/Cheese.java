package com.datorium.Datorium.API.DTOs;

public class Cheese {
    private String name;
    private double price;
    private int yearOfProduction;
    private boolean isAvailableInStore;

    // Constructors
    public Cheese() {}

    public Cheese(String name, double price, int yearOfProduction, boolean isAvailableInStore) {
        this.name = name;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.isAvailableInStore = isAvailableInStore;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public boolean isAvailableInStore() {
        return isAvailableInStore;
    }

    public void setAvailableInStore(boolean availableInStore) {
        isAvailableInStore = availableInStore;
    }
}