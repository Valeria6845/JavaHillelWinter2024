package org.homework17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Hw17Test {
    List<String> str = new ArrayList<>();

    @Test
    void average() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(3.0, Hw17.average(list));
    }

    @Test
    void convertToUpperCase() {
        str.add("one");
        str.add("two");
        str.add("three");
        String test = "[Pair(lowercase=one, uppercase=ONE), Pair(lowercase=two, uppercase=TWO), Pair(lowercase=three, uppercase=THREE)]";
        assertEquals(Hw17.convertToUpperCase(str).toString(), test);
    }

    @Test
    void lowerCaseWithLengthFour() {
        str.add("ONE");
        str.add("two");
        str.add("THREE");
        str.add("FOUR");
        str.add("five");
        str.add("stop");
        str.add("LAMP");
        assertEquals("[five, stop]", Hw17.lowerCaseWithLengthFour(str).toString());
    }
}