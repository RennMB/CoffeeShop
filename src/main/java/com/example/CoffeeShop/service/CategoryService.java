package com.example.CoffeeShop.service;

import com.example.CoffeeShop.model.Category;

import java.util.List;

public interface CategoryService {
    Category create (Category category);
    List<Category> getAll();
    Category update (Category category);
    void delete (Integer id);
}
