package homework15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Captcha cap = new Captcha();
        Scanner scan = new Scanner(System.in);
        cap.print();
        System.out.println("Enter the number shown above: ");
        String input = scan.nextLine();
        System.out.println(cap.check(input));
    }
}
