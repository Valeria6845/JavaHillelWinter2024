package com.homework29.services;

import com.homework29.dto.ProductDto;
import com.homework29.entities.Product;
import com.homework29.exception.ProductNotFoundException;
import com.homework29.mapper.ProductMapper;
import com.homework29.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDto getProductById(int id) {
        Product product = productRepository.findById((long) id).orElseThrow(() -> new ProductNotFoundException(String.valueOf(id)));
        return productMapper.toProductDto(product);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public void deleteProductById(int id) {
        productRepository.deleteById((long) id);
    }
}
