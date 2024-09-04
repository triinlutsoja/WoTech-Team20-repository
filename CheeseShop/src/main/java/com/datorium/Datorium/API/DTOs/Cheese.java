package com.datorium.Datorium.API.DTOs;

public class Cheese {
    public int id;  // I added a new property as suggested
    public String name;
    public double price;
    public int yearOfProduction;
    public boolean isAvailableInStore;


    public Cheese(int id, String name, double price, int yearOfProduction, boolean isAvailableInStore) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.isAvailableInStore = isAvailableInStore;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
