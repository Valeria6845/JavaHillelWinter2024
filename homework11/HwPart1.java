package homework11;

import java.util.ArrayList;
import java.util.Arrays;

public class HwPart1 {
    private String name;
    private int occurrence;
    public String getName() {
        return name;
    }
    public int getOccurrence() {
        return occurrence;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    public HwPart1(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public static int countOccurrence(ArrayList<String> list, String str) {
        int counter = 0;
        for (String o : list) {
            if (str.equals(o)) {
                counter++;
            }
        }
        return counter;
    }
    public static Object toList(Object[] arr) {
        Object a = Arrays.asList(arr);
        return a;
    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(0).equals(list.get(j))) {
                    list.remove(0);
                }else {
                    list.add(list.get(0));
                    list.remove(0);
                }
            }
        }
        return list;
    }
    private static ArrayList<String> findUniqueString(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(0).equals(list.get(j))) {
                    list.remove(0);
                }else {
                    list.add(list.get(0));
                    list.remove(0);
                }
            }
        }
        return list;
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
        ArrayList<HwPart1> hw = new ArrayList<>(list1.size());
        for (String o: list1) {
            int counter = HwPart1.countOccurrence(list, o);
            String name = o;
            hw.add(new HwPart1(name, counter));
        }
        return hw;
    }

    @Override
    public String toString() {
        return "HwPart1{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
