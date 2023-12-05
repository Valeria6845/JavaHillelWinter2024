import java.util.Scanner;

public class AverageOfTwoNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scan.nextInt();
        System.out.println("b: ");
        int b = scan.nextInt();
        double c = (a + b)/2;
        System.out.println("Average mean is: "+c);
    }
}