package org.homework24;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Product {
    private int id;
    private String name;
    private int cost;

    public Product(String name, int cost) {
        id++;
        this.name = name;
        this.cost = cost;
    }
}
