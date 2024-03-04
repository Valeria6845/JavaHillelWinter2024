package org.homework24;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@ToString

public class Order {
    private int id;
    private String date;
    private int cost;
    private List<Product> products;

    public Order(LocalDate date, int cost, List<Product> products, int id) {
        this.id = id;
        this.date = date.toString();
        this.cost = cost;
        this.products = products;
    }
}
