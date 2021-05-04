package com.example.CoffeeShop.controller;

import com.example.CoffeeShop.model.Category;
import com.example.CoffeeShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public Category create(@RequestBody Category category){return categoryService.create(category);}

    @GetMapping("/getCategories")
    public List<Category> getCategories(){return categoryService.getAll();}

    @PostMapping("/update")
    public Category update(@RequestBody Category category){return categoryService.update(category);}

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        categoryService.delete(id);
        return "Already deleted";
    }
}
