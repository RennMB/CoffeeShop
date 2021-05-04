package com.example.CoffeeShop.service;

import com.example.CoffeeShop.model.Category;
import com.example.CoffeeShop.model.Item;
import com.example.CoffeeShop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item create(Item item){
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAll(){
        return itemRepository.findAll();
    }

    @Override
    public Item update (Item item){
        return itemRepository.save(item);
    }

    @Override
    public void delete(Integer id){
        itemRepository.deleteById(id);
    }

    @Override
    public List<Item> getByCategory(String category){
        List<Item> itemList = itemRepository.findAll()
                .stream()
                .filter(x -> {
                   return x.getCategory().getName().equals(category);
        }).collect(Collectors.toList());
        return itemList;
    }
}
