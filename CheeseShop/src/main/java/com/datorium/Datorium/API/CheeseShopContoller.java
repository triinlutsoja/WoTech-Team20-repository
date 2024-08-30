package com.datorium.Datorium.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CheeseShopContoller {

    private CheeseShopService cheeseShopService;

    public CheeseShopContoller() {
        cheeseShopService = new CheeseShopService();
    }

    // All method names taken from Kintija's branch
    @PostMapping("/add")
    public Cheese addCheese(@RequestBody Cheese cheese){
        return cheeseShopService.addCheese(cheese);
    }

    @GetMapping("/getAll")
    public List<Cheese> getAll(){
        return cheeseShopService.getAll();
    }

    @GetMapping("/updateCheese")
    public Cheese updateCheese(Long id, Cheese updatedCheese){
        // find cheese form existing cheeses
        // I'd need a getCheese() method to get only ONE cheese based on a property, not all cheeses.
        // TODO:
        //if (cheeseShopService.repository) // unfinished
        deleteCheese(id);
        addCheese(updatedCheese);
    }

    @PostMapping("/deleteCheese")
    public void deleteCheese(@RequestBody Long id){

    }

}
