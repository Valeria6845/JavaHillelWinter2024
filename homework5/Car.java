package homework5;

public class Car {
    private static void startElectricity() {
        System.out.println("Start electricity");
    }
    private static void startCommand() {
        System.out.println("Start command");
    }
    private static void startFuelSystem() {
        System.out.println("Start fuel system");
    }
    public void start() {
        Car.startElectricity();
        Car.startCommand();
        Car.startFuelSystem();
    }
}
