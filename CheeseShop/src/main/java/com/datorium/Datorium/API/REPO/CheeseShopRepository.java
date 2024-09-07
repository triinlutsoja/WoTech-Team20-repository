package com.datorium.Datorium.API.Repo;

import com.datorium.Datorium.API.DTOs.Cheese;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CheeseShopRepository {

    public final List<Cheese> myCheese = new ArrayList<>();

    // Here we add a new cheese to the repository
    public void addCheese(Cheese cheese) {
        myCheese.add(cheese);
    }

    // Then get all cheeses from the repository
    public List<Cheese> getAllCheeses() {
        return new ArrayList<>(myCheese);
    }

    // And here get a specific cheese by its ID
    public Cheese getCheese(int id) {
        for (Cheese cheese : myCheese) {
            if (cheese.getId() == id) {
                return cheese; // Return the cheese if found
            }
        }
        System.out.println("Cheese with ID " + id + " not found.");
        return null; // Return null if no cheese is found
    }

    // This is a method to update cheese by its ID
    public void updateCheeseById(int id, Cheese updatedCheese) {
        for (int i = 0; i < myCheese.size(); i++) {
            Cheese cheese = myCheese.get(i);
            if (cheese.getId() == id) {
                myCheese.set(i, updatedCheese);
                return;
            }
        }
        System.out.println("Cheese with ID " + id + " not found.");
    }

    // Delete cheese by its ID
    public void deleteCheeseById(int id) {
        myCheese.removeIf(cheese -> cheese.getId() == id);
    }
}
