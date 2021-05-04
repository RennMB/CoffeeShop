package com.example.CoffeeShop.repository;

import com.example.CoffeeShop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
