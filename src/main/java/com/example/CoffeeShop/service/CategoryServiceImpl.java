package com.example.CoffeeShop.service;

import com.example.CoffeeShop.model.Category;
import com.example.CoffeeShop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category create (Category category){
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    @Override
    public Category update(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Integer id){
        categoryRepository.deleteById(id);
    }
}
