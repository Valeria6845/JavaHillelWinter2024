package org.homework18;

import lombok.Getter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
@Getter

public class Shop {
    private List<Product> products = new ArrayList<>();
    private int dayCounter;

    public List<Product> highPriceBooks() {
        return products.stream().filter(e -> e.getType().equals(ProductType.BOOK)).filter(e -> e.getPrice() > 250).toList();
    }

    public List<Product> booksWithDiscount() {
        return products.stream().filter(e -> e.getType().equals(ProductType.BOOK))
                .filter(Product::isThereADiscount)
                .peek(e -> e.setPrice(e.getPrice() - (int) (e.getPrice() * 0.1))).toList();
    }

    public Product theCheapestBook() {
        try {
            Optional<Product> book = products.stream().filter(e -> e.getType()
                    .equals(ProductType.BOOK)).min(Comparator.comparing(Product::getPrice));
            return book.get();
        } catch (NoSuchElementException ex) {
            throw new ProductNotFoundException("Product of " + ProductType.BOOK + " category is not found");
        }
    }

    public List<Product> threeLastProducts() {
        return products.stream().skip(products.size() - 3).toList();
    }

    public int totalCostOfCheapBooksNow() {
        return products.stream().filter(e -> e.getDateAdded().getYear() == LocalDate.now().getYear()).
                filter(e -> e.getType().equals(ProductType.BOOK)).
                filter(e -> e.getPrice() < 75).mapToInt(Product::getPrice).sum();
    }

    public Map<ProductType, List<Product>> sortToMap() {
        Set<ProductType> set = new HashSet<>();
        return products.stream().filter(e -> set.add(e.getType())).collect(Collectors.toMap(
                e -> e.getType(),
                e -> products.stream().filter(a -> a.getType().equals(e.getType())).toList()
        ));
    }

    public boolean add(ProductType type, int price, boolean discount) {
        dayCounter++;
        LocalDate date = LocalDate.now().plusDays(dayCounter);
        products.add(new Product(type, price, discount, date));
        return true;
    }
}