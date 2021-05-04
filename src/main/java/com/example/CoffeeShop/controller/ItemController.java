package com.example.CoffeeShop.controller;

import com.example.CoffeeShop.model.Item;
import com.example.CoffeeShop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    public Item create(@RequestBody Item item){return itemService.create(item);}

    @GetMapping("/getItems")
    public List<Item>getItems(){return itemService.getAll();}

    @PostMapping("/update")
    public Item update(@RequestBody Item item){return itemService.update(item);}

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        itemService.delete(id);
        return "Already deleted";
    }

    @GetMapping("/getByCategory/{category}")
    public List<Item> getByCategory(@PathVariable String category){return itemService.getByCategory(category);}
}
