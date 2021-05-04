package com.example.CoffeeShop.repository;

import com.example.CoffeeShop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
