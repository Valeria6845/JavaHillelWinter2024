import java.util.Scanner;

public class AverageMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of numbers: ");
        int nums = scan.nextInt();
        int sum = 0;
        System.out.println("Enter numbers (every number on new line): ");
        for (int i = 0; i < nums; i++) {
            sum += scan.nextInt();
        }
        System.out.println("Result is: "+sum/nums);
    }
}
