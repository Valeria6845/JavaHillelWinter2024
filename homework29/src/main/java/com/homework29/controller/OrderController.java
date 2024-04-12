package com.homework29.controller;

import com.homework29.dto.Order;
import com.homework29.dto.Product;
import com.homework29.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderRepository op;

    private static final String CALL_ENDPOINT = "call endpoint : %s ";

    @GetMapping("/ping")
    public String ping() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }
    @PostMapping("/add")
    public int addOrder(@RequestBody List<Product> products) {
        return op.addOrder(products);
    }
    @GetMapping("/get/{id}")
    public Order getOrder(@PathVariable int id) {
        return op.getOrderById(id);
    }
    @GetMapping("/getAll")
    public Collection<Order> getAllOrders() {
        return op.getAllOrders();
    }
}
