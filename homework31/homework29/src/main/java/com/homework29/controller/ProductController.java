package com.homework29.controller;

import com.homework29.dto.ProductDto;
import com.homework29.entities.Product;
import com.homework29.services.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;

    @GetMapping("/get/{id}")
    public ProductDto getProduct(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProductById(id);
    }
}
