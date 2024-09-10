package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.Repo.CheeseShopRepository;
import com.datorium.Datorium.API.DTOs.Cheese;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CheeseShopService {

    //CheeseShopRepository used
    private final CheeseShopRepository repository;

    //CheeseShopRepository used
    public CheeseShopService() {
        repository = new CheeseShopRepository();
    }

    public void addCheese(Cheese cheese) {
        repository.addCheese(cheese);
    }

    public Cheese getCheese(int id){
        return repository.getCheese(id);
    }

    public List<Cheese> getAllCheeses() {
        return repository.getAllCheeses();
    }

    public Cheese updateCheese(int id, Cheese updatedCheese) {
        Cheese existingCheese = repository.getCheese(id);

        if (existingCheese == null) {
            throw new RuntimeException("404 Cheese not found.");
        }

        existingCheese.setName(updatedCheese.getName());
        existingCheese.setPrice(updatedCheese.getPrice());
        existingCheese.setYearOfProduction(updatedCheese.getYearOfProduction());
        existingCheese.setAvailableInStore(updatedCheese.isAvailableInStore());

        return repository.getCheese(id);
    }

    public void deleteCheeseById(int id) {
        repository.deleteCheeseById(id);
    }

}