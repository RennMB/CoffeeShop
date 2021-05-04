package com.example.CoffeeShop.bootstrap;

import com.example.CoffeeShop.model.Category;
import com.example.CoffeeShop.model.Item;
import com.example.CoffeeShop.repository.CategoryRepository;
import com.example.CoffeeShop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements ApplicationRunner {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        try{
            Category snacks = new Category("snack_1", "url:asrd");
            Category drinks = new Category("drink_1", "url:sdfr");
            Category hots = new Category("hot_1", "url:fgrt");

            Item it_1 = new Item("snickers", "chocolate", "35gr", 50.0, "url:fgbv", snacks,  10.0);
            Item it_2 = new Item("coca-cola", "soda", "250ml", 50.0, "url:kgfklj", drinks, 10.0);
            Item it_3 = new Item("cream-soup", "soup", "350 gr", 120.0, "url:dfgrt", hots, 0.0);

            categoryRepository.save(snacks);
            categoryRepository.save(drinks);
            categoryRepository.save(hots);

            itemRepository.save(it_1);
            itemRepository.save(it_2);
            itemRepository.save(it_3);

        }
        catch (DataIntegrityViolationException ex){
            System.out.println("Data Error" + ex.getClass());
        }
        catch (Exception ex){
            System.out.println("Unexpected Error");
            System.out.println(ex.getStackTrace());
        }

        finally {
            System.out.println("BootStrap executed");
        }
    }
}
