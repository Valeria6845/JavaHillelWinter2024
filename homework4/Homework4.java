package homework4;

public class Homework4 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if ((a + b) >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 14;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkInRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkIsPosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean checkIsNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
    public static boolean checkIsYearIsLeap (int year) {
        if (year % 400 == 0) {
            return true;
        }else if (year % 100 == 0) {
            return false;
        }else if (year % 4 == 0){
            return true;
        }else {
            return false;
        }
    }
}
