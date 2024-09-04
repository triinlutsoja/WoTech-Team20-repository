package com.datorium.Datorium.API.Repo;

import com.datorium.Datorium.API.DTOs.Cheese;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CheeseShopRepository {

    public final List<Cheese> myCheese = new ArrayList<>();

    // Here I add a new cheese to the repository
    public void addCheese(Cheese cheese) {
        myCheese.add(cheese);
    }

    // Here I get all cheeses from the repository
    public List<Cheese> getAllCheeses() {
        return new ArrayList<>(myCheese);
    }

    // Here I get a specific cheese 
    public Cheese getCheese() {
        // For simplicity, returning the first cheese or a default cheese
        if (!myCheese.isEmpty()) {
            return myCheese.get(0); // Or apply different logic if needed
        }
        System.out.println("No cheese found.");
        return null;  // Return null if no cheese is found
    }

    // Update cheese by its ID
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
