public class Deposit {
    public static void main(String[] args) {
        double amount = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]);
        double years = Double.parseDouble(args[2]);
        int counter = 0;
        for (int i = 0; i < years*12; i++) {
            amount *= (1 + percent/(12*100));
            counter++;
            if (counter % 12 == 0) {
                System.out.println("Your amount for " + counter / 12 + " year(s) is: " + amount);
            }
        }
    }
}
