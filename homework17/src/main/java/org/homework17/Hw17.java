package org.homework17;

import java.util.List;
import java.util.stream.Collectors;

public class Hw17 {
    public static double average(List<Integer> list) {
        return list.stream().collect(Collectors.averagingInt(num -> num));
    }
    public static List<Pair> convertToUpperCase(List<String> list) {
        return list.stream().map(e -> new Pair(e.toLowerCase(), e.toUpperCase())).toList();
    }
    public static List<String> lowerCaseWithLengthFour(List<String> list) {
        return list.stream().filter(e -> e.equals(e.toLowerCase())).filter(e -> e.length() == 4).toList();
    }
}
