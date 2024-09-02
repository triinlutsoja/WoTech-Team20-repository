package com.datorium.Datorium.API.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class CheeseShopController {

    CheeseShopService cheeseShopService;

    public CheeseShopController() {
        cheeseShopService = new CheeseShopService();
    }

    // TODO: Don't forget to specify that the URL should be /cheese-shop for all methods?

    // CRUD methods

    @PostMapping("/add")
    public Cheese addCheese(Cheese cheese){
        // TODO:
    }

    // TODO: getCheese and getAllCheeses

    @PutMapping("/update")
    // TODO:

    @DeleteMapping("/delete")
    // TODO:
}
