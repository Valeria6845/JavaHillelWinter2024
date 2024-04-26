package com.homework29.controller;

import org.slf4j.Logger;
import com.homework29.dto.ProductDto;
import com.homework29.entities.Order;
import com.homework29.services.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
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

    private static final Logger logInfo = LoggerFactory.getLogger("logger.info");
    private final OrderService orderService;

    @PostMapping("/add")
    public int addOrder(@RequestBody List<ProductDto> productDtos) {
        logInfo.info("Adding new order");
        return orderService.addOrder(productDtos).getId();
    }
    @PostMapping("/createWithProductId")
    public int createOrderWithExistingProduct(@RequestBody int id) {
        logInfo.info("Creating new order with product id {}", id);
        return orderService.createOrder(id).getId();
    }
    @GetMapping("/get/{id}")
    public Order getOrderById(@PathVariable int id) {
        logInfo.info("Retrieving order with id {}", id);
        return orderService.getOrderById(id);
    }
    @PutMapping("/add/{orderId}/{productId}")
    public int addProductToOrderById(@PathVariable int orderId, @PathVariable int productId) {
        logInfo.info("Adding product with id {} to order with id {}", productId, orderId);
        return orderService.addProductToOrderById(orderId, productId);
    }
    @PutMapping("/add/{orderId}")
    public int addProductToOrder(@PathVariable int orderId, @RequestBody ProductDto productDto) {
        logInfo.info("Adding new product to order with id {}", orderId);
        return orderService.addProductToOrder(orderId, productDto);
    }
    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        logInfo.info("Retrieving all orders");
        return orderService.getAllOrders();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteOrderById(@PathVariable int id) {
        logInfo.info("Deleting order with id {}", id);
        orderService.deleteOrderById(id);
    }
}
