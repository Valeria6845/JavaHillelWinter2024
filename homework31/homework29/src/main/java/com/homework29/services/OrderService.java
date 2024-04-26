package com.homework29.services;

import com.homework29.dto.ProductDto;
import com.homework29.entities.Order;
import com.homework29.entities.Product;
import com.homework29.exception.OrderNotFoundException;
import com.homework29.exception.ProductNotFoundException;
import com.homework29.mapper.ProductMapper;
import com.homework29.repository.OrderRepository;
import com.homework29.repository.ProductRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Getter
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    public Order addOrder(List<ProductDto> productDtos) {
        int totalCost = 0;
        List<Product> products = productMapper.toProducts(productDtos);
        for (Product p: products) {
            productRepository.save(p);
            totalCost += p.getCost();
        }
        Order newOrder = new Order(LocalDate.now(), totalCost, products);
        return orderRepository.save(newOrder);
    }

    /**
     * Изначально в параметрах был список интеджеров, но я так и не разобралась,
     * как отобразить список чисел в формате JSON так, чтобы спринг меня понял.
     * Или как передать его в параметре пути.
     */
    public Order createOrder(int id) {
        Product product = productRepository.findById((long)id).get();
//        int totalCost = 0;
//        for(Integer id: ids) {
//            Optional<Product> product = productRepository.findById((long) id);
//            totalCost += product.get().getCost();
//            products.add(product.get());
//        }
        Order order = new Order(LocalDate.now(),product.getCost(), new ArrayList<>());
        order.getProducts().add(product);
        return orderRepository.save(order);
    }

    /**
     * Здесь я не совсем поняла, как было бы лучше:
     * возвращать в виде dto или все же entity, ведь пользователю было бы
     * полезно знать id, чтоб позднее по нему найти как и "заказ", так и "продукты".
     */
    public Order getOrderById(int id) {
        Order order = orderRepository.findById((long) id).orElseThrow(() -> new OrderNotFoundException(String.valueOf(id)));
//        List<ProductDto> products = order.getProducts().stream().map(productMapper::toProductDto).toList();
//        OrderDto orderDto = new OrderDto(order.getId(), order.getDate(), order.getCost(), products);
//        return orderDto;
        return order;
    }
    public int addProductToOrderById(int orderId, int productId) {
        Order order = orderRepository.findById((long) orderId).orElseThrow(() -> new OrderNotFoundException(String.valueOf(orderId)));
        Product product = productRepository.findById((long) productId).orElseThrow(() -> new ProductNotFoundException(String.valueOf(productId)));
        order.getProducts().add(product);
        order.setCost(order.getCost()+product.getCost());
        return orderRepository.save(order).getId();
    }
    public int addProductToOrder(int orderId, ProductDto productDto) {
        Order order = orderRepository.findById((long) orderId).orElseThrow(() -> new OrderNotFoundException(String.valueOf(orderId)));
        Product product = productMapper.toProduct(productDto);
        productRepository.save(product);
        order.getProducts().add(product);
        order.setCost(order.getCost()+product.getCost());
        return orderRepository.save(order).getId();
    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    public void deleteOrderById(int id) {
        orderRepository.deleteById((long) id);
    }
}