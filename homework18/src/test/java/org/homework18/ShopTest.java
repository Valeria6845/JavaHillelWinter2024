package org.homework18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();

    @Test
    void highPriceBooks() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.BOOK, 251, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        shop.add(ProductType.BOOK, 73, false);
        shop.add(ProductType.BOOK, 300, false);
        assertEquals("[Product(type=BOOK, price=251, isThereADiscount=true, dateAdded=2024-02-03), " +
                        "Product(type=BOOK, price=300, isThereADiscount=false, dateAdded=2024-02-06)]",
                shop.highPriceBooks().toString());
    }

    @Test
    void booksWithDiscount() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.BOOK, 251, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        shop.add(ProductType.BOOK, 73, false);
        shop.add(ProductType.BOOK, 300, false);
        assertEquals("[Product(type=BOOK, price=226, isThereADiscount=true, dateAdded=2024-02-03)]", shop.booksWithDiscount().toString());
    }

    @Test
    void theCheapestBook() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.BOOK, 251, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        shop.add(ProductType.BOOK, 73, false);
        shop.add(ProductType.BOOK, 300, false);
        assertEquals("Product(type=BOOK, price=73, isThereADiscount=false, dateAdded=2024-02-05)", shop.theCheapestBook().toString());
    }
    @Test
    void theCheapestBookExceptionTest() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.ERASER, 25, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        assertThrows(ProductNotFoundException.class, () -> shop.theCheapestBook());
    }

    @Test
    void threeLastProducts() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.BOOK, 251, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        shop.add(ProductType.BOOK, 73, false);
        shop.add(ProductType.BOOK, 300, false);
        assertEquals("[Product(type=NOTEBOOK, price=70, isThereADiscount=true, dateAdded=2024-02-04), " +
                "Product(type=BOOK, price=73, isThereADiscount=false, dateAdded=2024-02-05), " +
                "Product(type=BOOK, price=300, isThereADiscount=false, dateAdded=2024-02-06)]",
                shop.threeLastProducts().toString()
        );
    }

    @Test
    void totalCostOfCheapBooksNow() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.BOOK, 251, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        shop.add(ProductType.BOOK, 73, false);
        shop.add(ProductType.BOOK, 30, false);
        assertEquals(103, shop.totalCostOfCheapBooksNow());
    }

    @Test
    void sortToMap() {
        shop.add(ProductType.PEN, 10, false);
        shop.add(ProductType.BOOK, 251, true);
        shop.add(ProductType.NOTEBOOK, 70, true);
        shop.add(ProductType.PEN, 73, false);
        shop.add(ProductType.BOOK, 300, false);
        assertEquals("{NOTEBOOK=[Product(type=NOTEBOOK, price=70, isThereADiscount=true, dateAdded=2024-02-04)], " +

                "PEN=[Product(type=PEN, price=10, isThereADiscount=false, dateAdded=2024-02-02), " +
                "Product(type=PEN, price=73, isThereADiscount=false, dateAdded=2024-02-05)], " +

                "BOOK=[Product(type=BOOK, price=251, isThereADiscount=true, dateAdded=2024-02-03), " +
                "Product(type=BOOK, price=300, isThereADiscount=false, dateAdded=2024-02-06)]}",
                shop.sortToMap().toString()
                );
    }

    @Test
    void add() {
        shop.add(ProductType.PEN, 10, false);
        assertEquals("[Product(type=PEN, price=10, isThereADiscount=false, dateAdded=2024-02-02)]", shop.getProducts().toString());
    }
}