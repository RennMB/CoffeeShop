package com.example.CoffeeShop.service;

import com.example.CoffeeShop.model.Item;
import com.example.CoffeeShop.model.Order;

import java.util.List;
import java.util.Set;

public interface OrderService {
    Set<Order> getOrders();
    Order getOrderById(Long id);
    Order create (Order order);
    Order update (Order order);
    void delete (Long id);
}

