package com.homework29.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Order {
    private int id;
    private LocalDate date;
    private int cost;
    private List<Product> products;
}
