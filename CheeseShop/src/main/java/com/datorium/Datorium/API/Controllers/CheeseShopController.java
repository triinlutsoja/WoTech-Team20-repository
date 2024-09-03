package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Cheese;
import org.springframework.web.bind.annotation.*;

public class CheeseShopController {

    CheeseShopService cheeseShopService;

    public CheeseShopController() {
        cheeseShopService = new CheeseShopService();
    }

    // TODO: Don't forget to specify that the URL should be /cheese-shop for all methods?

    // CRUD methods

    @PostMapping("/add")
    public void addCheese(Cheese cheese){
        // TODO:
    }

    @GetMapping("/get")
    public Cheese getCheese(int id){  // TODO: Based on what? By id? Is not specified in the requirements
        return cheeseShopService.getCheese(int id);
    }

    // TODO: getAllCheeses()

    @PutMapping("/update")
    public void updateCheeseById(@PathVariable("id") int id, @RequestBody Cheese cheese){
        Cheese originalCheese = getCheese(id);  // find cheese that need to be updated

        if (originalCheese != null) {
            // TODO: if Cheese.java gets the 'id' property, add this line here
            originalCheese.setName(cheese.getName());
            originalCheese.setPrice(cheese.getPrice());
            originalCheese.setAvailableInStore(cheese.isAvailableInStore());
            originalCheese.setYearOfProduction(cheese.getYearOfProduction());
        } else {
            // Cheese doesn't exist, so add it to the list
            addCheese(cheese);
        }
    }

    @DeleteMapping("/delete")
    public void deleteCheeseById(int id){
        // TODO:
    }
}
