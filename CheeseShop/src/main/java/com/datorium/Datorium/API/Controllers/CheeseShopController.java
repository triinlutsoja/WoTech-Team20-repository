package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.CheeseShopService;
import com.datorium.Datorium.API.DTOs.Cheese;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cheeseshop")
public class CheeseShopController {

    private CheeseShopService cheeseShopService;

    public CheeseShopController() {  // constructor
        cheeseShopService = new CheeseShopService();
    }

    // TODO: Don't forget to specify that the URL should be /cheese-shop for all methods?

    // CRUD methods

    @PostMapping("/add")
    public void addCheese(Cheese cheese){
        cheeseShopService.addCheese(cheese);
    }

    @GetMapping("/get")
    public Cheese getCheese(@RequestParam int id){
        return cheeseShopService.getCheese(id);
    }

    @GetMapping("/getAll")
    public List<Cheese> getAllCheeses(){
        return cheeseShopService.getAllCheeses();
    }

    @PutMapping("/update")
    public void updateCheeseById(@PathVariable("id") int id, @RequestBody Cheese cheese){
        Cheese originalCheese = getCheese(id);  // find cheese that need to be updated

        if (originalCheese != null) {  // If such cheese exists
            originalCheese.setName(cheese.getName());
            originalCheese.setPrice(cheese.getPrice());
            originalCheese.setAvailableInStore(cheese.isAvailableInStore());
            originalCheese.setYearOfProduction(cheese.getYearOfProduction());
        } else {
            // If no such cheese exists, add it to the mock database
            addCheese(cheese);
        }
    }

    @DeleteMapping("/delete")
    public void deleteCheeseById(@PathVariable int id){
        cheeseShopService.deleteCheeseById(id);
    }
}
