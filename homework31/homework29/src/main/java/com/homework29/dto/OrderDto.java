package com.homework29.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderDto(int id, LocalDate date, int cost, List<ProductDto> productDtos) {
}
