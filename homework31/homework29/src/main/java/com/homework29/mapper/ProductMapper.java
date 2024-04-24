package com.homework29.mapper;

import com.homework29.dto.ProductDto;
import com.homework29.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    
    List<Product> toProducts(List<ProductDto> productDtoList);
    ProductDto toProductDto(Product product);
    Product toProduct(ProductDto productDto);
}
