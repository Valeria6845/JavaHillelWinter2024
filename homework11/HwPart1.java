package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HwPart1 {
    public static int countOccurrence(List<String> list, String str) {
        int counter = 0;
        if (str == null) {
            for (String o: list) {
                if (o == null) {
                    counter++;
                }
            }
        }else {
            for (String o : list) {
                if (str.equals(o)) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static Object toList(Object[] arr) {
     return Arrays.asList(arr);
    }

    public static List<Integer> findUnique(ArrayList<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (Integer o: input) {
            if (!result.contains(o)) {
                result.add(o);
            }
        }
        return result;
    }
    private static ArrayList<String> findUniqueString(ArrayList<String> input) {
        ArrayList<String> result = new ArrayList<>();
        for (String o: input) {
            if (!result.contains(o)) {
                result.add(o);
            }
        }
        return result;
    }
    public static String calcOccurrence(ArrayList<String> list) {
        String result = "";
        ArrayList<String> list1 = new ArrayList<>(list);
        list1 = HwPart1.findUniqueString(list1);
        for (String o: list1) {
            int counter = HwPart1.countOccurrence(list, o);
            result = result+o+": "+counter+"; ";
        }
        return result;
    }
    public static Object findOccurrence(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>(list);
        list1 = HwPart1.findUniqueString(list1);
        ArrayList<Element> hw = new ArrayList<>();
        for (String o: list1) {
            int counter = HwPart1.countOccurrence(list, o);
            hw.add(new Element(o, counter));
        }
        return hw;
    }
}
