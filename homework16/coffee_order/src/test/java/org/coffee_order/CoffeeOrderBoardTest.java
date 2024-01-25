package org.coffee_order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderBoardTest {
    CoffeeOrderBoard board = new CoffeeOrderBoard();

    @Test
    void add() {
        assertEquals("[]", board.draw().toString());
        board.add("Max");
        assertEquals("[1|Max]", board.draw().toString());
        board.add("Katrine");
        assertEquals("[1|Max, 2|Katrine]", board.draw().toString());
    }

    @Test
    void deliver() {
        board.add("Max");
        board.add("Katrine");
        board.add("Mary");
        assertEquals("[1|Max, 2|Katrine, 3|Mary]", board.draw().toString());
        board.deliver();
        assertEquals("[2|Katrine, 3|Mary]", board.draw().toString());
    }

    @Test
    void testDeliver() {
        int number = 2;
        board.add("Max");
        board.add("Katrine");
        board.add("Mary");
        assertEquals("[1|Max, 2|Katrine, 3|Mary]", board.draw().toString());
        board.deliver(number);
        assertEquals("[1|Max, 3|Mary]", board.draw().toString());
    }

    @Test
    void draw() {
        board.add("Max");
        board.add("Katrine");
        board.add("Mary");
        assertEquals("[1|Max, 2|Katrine, 3|Mary]", board.draw().toString());
    }
}