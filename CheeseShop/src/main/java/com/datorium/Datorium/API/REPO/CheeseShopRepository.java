package com.datorium.Datorium.API.REPO;

import com.datorium.Datorium.API.DTOs.Cheese;
import java.util.ArrayList;

public class CheeseShopRepository {
    public ArrayList<Cheese> myCheese = new ArrayList<>();

    // Here we add a new cheese to the repository
    public void addCheese(Cheese cheese) {
        myCheese.add(cheese);
    }

    // Here we get all cheeses from the repository
    public ArrayList<Cheese> getAllCheeses() {
        return myCheese;
    }

    // Here we update an existing cheese in the repository
    public void updateCheese(int index, Cheese updatedCheese) { //Index is the position of the cheese in the ArrayList that we want to update.
        if (index >= 0 && index < myCheese.size()) { //This part is checking whether the provided index is valid. myCheese.size() shows us there is an item at this index and it is within the bounds of the list
            myCheese.set(index, updatedCheese); //here set is a method, but with the updatedCheese object we replace the existing Cheese object at the specified index
        }
    }

    // And here we delete a cheese from the repository
    public void deleteCheese(int index) { //Index is the position of the cheese in the ArrayList that we want to remove.

        if (index >= 0 && index < myCheese.size()) {
            myCheese.remove(index); //Here remove() is a method and it removes the Cheese object at the specified index from the ArrayList.
        }
    }
}