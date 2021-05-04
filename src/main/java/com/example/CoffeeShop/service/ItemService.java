package com.example.CoffeeShop.service;

import com.example.CoffeeShop.model.Item;

import java.util.List;

public interface ItemService {
    Item create (Item item);
    List<Item> getAll();
    Item update (Item item);
    void delete (Integer id);
    List<Item> getByCategory(String category);
}
