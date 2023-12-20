package homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (Subscriber o: SubGenerator.generateList()) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        SubscriberServiceImpl sub = new SubscriberServiceImpl();
        sub.showCityCallDurationExceedTheLimit(SubGenerator.generateList());
        System.out.println("-----------------------------------");
        sub.showInterCityCallDuration(SubGenerator.generateList());
        System.out.println("-----------------------------------");
        System.out.println("Enter the first letter of the last name");
        sub.showInformationByTheFirstLetter(SubGenerator.generateList(), scan.nextLine());
        System.out.println("-----------------------------------");
        System.out.println(sub.calculateSumOfInternetTraffic(SubGenerator.generateList(), "New York"));
        System.out.println("-----------------------------------");
        System.out.println(sub.calculateSubsWithNegativeBalance(SubGenerator.generateList()));
    }
}
