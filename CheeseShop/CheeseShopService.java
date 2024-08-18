package com.datorium.Datorium.API;

//import cheese
//import CheeseShopRepository
import java.util.List;

public class CheeseShopService {

    //CheeseShopRepository used
    private final CheeseShopRepository repository;

    //CheeseShopRepository used
    public CheeseShopService(CheeseShopRepository repository) {
        this.repository = repository;
    }

    //Cheese used
    public List<Cheese> getAll() {
        return repository.findAll();
    }

    public Cheese getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("This cheese is currently not available."));
    }

    public Cheese addCheese(Cheese cheese) {
        return repository.save(cheese);
    }

    public void deleteCheese(Long id) {
        repository.deleteById(id);
    }

}
