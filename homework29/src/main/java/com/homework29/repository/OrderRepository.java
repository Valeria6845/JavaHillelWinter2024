package com.homework29.repository;

import com.homework29.dto.Order;
import com.homework29.dto.Product;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepository {
    private int orderId;
    private int productId;
    @Getter
    private Map<Integer, Order> orders;

    public OrderRepository() {
        orders = new HashMap<>();
    }
    public int addOrder(List<Product> products) {
        orderId++;
        int totalCost = 0;
        for (Product p: products) {
            productId++;
            p.setId(productId);
            totalCost += p.getCost();
        }
        Order newOrder = new Order(orderId, LocalDate.now(), totalCost, products);
        orders.put(orderId, newOrder);
        return orderId;
    }
    public Collection<Order> getAllOrders() {
        return orders.values();
    }
    public Order getOrderById(int id) {
        return orders.get(id);
    }
}