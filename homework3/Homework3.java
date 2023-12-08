package homework3;

import java.util.Arrays;

public class Homework3 {
    public static void printUnpairedNums () {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void calcFactorial (int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        System.out.println("Factorial of number "+a+" is: "+b);
    }
    public static void printUnpairedWhile () {
        int i = 1;
        System.out.print(i+" ");
        do {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }while (i <= 99);
        System.out.println(" ");
    }
    public static void calcFactorialWhile (int a) {
        int b = 1;
        int i = 1;
        do {
            b *= i;
            i++;
        }while (i <= a);
        System.out.println("Factorial of number "+a+" is: "+b);
    }
    public static void calcPowerOfNum (int a, int b) {
        int c = a;
        for (int i = 1; i < b; i++) {
            c *= a;
        }
        System.out.println(a+" to the "+b+" power is: "+c);
    }
    public static void printNegNums () {
        int counter = 0;
        for (int i = 0; i > -100; i -= 5) {
            counter++;
            if (counter > 10) {
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void getMultiplicationTable (int a) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(a+" * "+i+" = "+a * i);
        }
    }
    public static void printUnpairedArray () {
        int[] nums = new int[10];
        int i = 1;
        int j = 0;
        int count = 1;
        while (true) {
            if (i % 2 == 0) {
                count++;
            }else {
                nums[i-count] = i;
                j++;
            }
            if (j == nums.length) {
                break;
            }
            i++;
        }
        for (int o = 0; o < nums.length; o++) {
            System.out.print(nums[o]);
            if (o < nums.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }
    public static void findMinElement (int[] nums) {
        int min = 0;
        o:for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
               if (nums[i] > nums[j]) {
                   continue o;
               }else {
                   min = nums[i];
               }
               if (j == nums.length-1){
                   break o;
               }
            }
        }
        System.out.println(min);
    }
    public static void findMaxElement (int[] nums) {
        int max = 0;
        o:for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    continue o;
                }else {
                    max = nums[i];
                }
                if (j == nums.length-1){
                    break o;
                }
            }
        }
        System.out.println(max);
    }
    public static void changeMinMax (int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        Arrays.sort(nums2);
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums2[0]) {
                min = i;
            }
            if (nums[i] == nums2[nums2.length - 1]) {
                max = i;
            }
        }
        int save = nums[min];
        nums[min] = nums[max];
        nums[max] = save;
        System.out.println(Arrays.toString(nums));
    }
}
