package homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1---------------------");
        Homework3.printUnpairedNums();
        System.out.println("2---------------------");
        Homework3.calcFactorial(10);
        System.out.println("3---------------------");
        Homework3.printUnpairedWhile();
        System.out.println("4---------------------");
        Homework3.calcFactorialWhile(10);
        System.out.println("5---------------------");
        Homework3.calcPowerOfNum(2, 3);
        System.out.println("6---------------------");
        Homework3.printNegNums();
        System.out.println("7---------------------");
        Homework3.getMultiplicationTable(scan.nextInt());
        System.out.println("8---------------------");
        Homework3.printUnpairedArray();
        System.out.println("9---------------------");
        int[] nums = {10, 6, 3, 8, 0, 1, 5};
        Homework3.findMinElement(nums);
        System.out.println("10--------------------");
        Homework3.findMaxElement(nums);
        System.out.println("11--------------------");
        Homework3.changeMinMax(nums);
    }
}
