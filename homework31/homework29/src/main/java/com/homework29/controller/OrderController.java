package com.homework29.controller;

import com.homework29.dto.ProductDto;
import com.homework29.entities.Order;
import com.homework29.services.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/add")
    public int addOrder(@RequestBody List<ProductDto> productDtos) {
        return orderService.addOrder(productDtos).getId();
    }
    @PostMapping("/createWithProductId")
    public int createOrderWithExistingProduct(@RequestBody int id) {
        return orderService.createOrder(id).getId();
    }
    @GetMapping("/get/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }
    @PutMapping("/add/{orderId}/{productId}")
    public int addProductToOrderById(@PathVariable int orderId, @PathVariable int productId) {
        return orderService.addProductToOrderById(orderId, productId);
    }
    @PutMapping("/add/{orderId}")
    public int addProductToOrder(@PathVariable int orderId, @RequestBody ProductDto productDto) {
        return orderService.addProductToOrder(orderId, productDto);
    }
    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteOrderById(@PathVariable int id) {
        orderService.deleteOrderById(id);
    }
}
