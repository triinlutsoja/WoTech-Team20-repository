package com.datorium.Datorium.API;

//import cheese
//import CheeseShopRepository
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CheeseShopService {

    //CheeseShopRepository used
    private final CheeseShopRepository repository;

    //CheeseShopRepository used
    public CheeseShopService(CheeseShopRepository repository) {
        this.repository = repository;
    }

    public Cheese addCheese(Cheese cheese) {
        return repository.save(cheese);
    }

    //Cheese used
    public List<Cheese> getAll() {
        return repository.findAll();
    }

    public Cheese updateCheese(Long id, Cheese updatedCheese) {
        Cheese existingCheese = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("404 Cheese not found."));

        existingCheese.setName(updatedCheese.getName());
        existingCheese.setPrice(updatedCheese.getPrice());
        existingCheese.setYearOfProduction(updatedCheese.getYearOfProduction());
        existingCheese.setAvailableInStore(updatedCheese.isAvailableInStore());

        return repository.save(existingCheese);
    }

    
    public void deleteCheese(Long id) {
        repository.deleteById(id);
    }

}
