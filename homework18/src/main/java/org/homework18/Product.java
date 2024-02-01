package org.homework18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@ToString

public class Product {
    private ProductType type;
    private int price;
    private boolean isThereADiscount;
    private LocalDate dateAdded;
}
