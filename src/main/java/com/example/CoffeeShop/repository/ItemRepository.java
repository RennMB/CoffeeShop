package com.example.CoffeeShop.repository;

import com.example.CoffeeShop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
