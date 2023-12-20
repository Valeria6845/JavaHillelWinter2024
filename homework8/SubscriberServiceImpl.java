package homework8;

public class SubscriberServiceImpl implements SubscriberService{
    @Override
    public void showCityCallDurationExceedTheLimit(Subscriber[] list) {
        System.out.println("The duration of a city call exceeds the limit for subscribers: ");
        for (Subscriber o: list) {
            if (o.getCityCallDuration() > 200) {
                System.out.println(o.toString());
            }
        }
    }
    @Override
    public void showInterCityCallDuration(Subscriber[] list) {
        System.out.println("Subscribers who used inter city communication: ");
        for (Subscriber o: list) {
            if (o.getInterCityCallDuration() > 0) {
                System.out.println(o.toString());
            }
        }
    }
    @Override
    public void showInformationByTheFirstLetter(Subscriber[] list, String firstLetter) {
        int check = 0;
        String letter = firstLetter.toUpperCase();
        System.out.println("Subscribers with the "+letter+":");
        for (Subscriber o: list) {
            String b = String.valueOf(o.getLastName().charAt(0));
            if (letter.equals(String.valueOf(o.getLastName().charAt(0)))) {
                System.out.println(o.toString());
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Nothing found");
        }
    }
    @Override
    public int calculateSumOfInternetTraffic(Subscriber[] list, String city) {
        System.out.println("Total consumption of the internet traffic for the "+city+" city: ");
        int sum = 0;
        for (Subscriber o: list) {
            if (o.getCity().equals(city)) {
                sum += o.getInternetTraffic();
            }
        }
        if (sum == 0) {
            System.out.println("Nothing found");
        }
        return sum;
    }
    @Override
    public int calculateSubsWithNegativeBalance(Subscriber[] list) {
        System.out.println("Amount of subscribers with negative balance: ");
        int sum = 0;
        for (Subscriber o: list) {
            if (o.getBalance() < 0) {
                sum++;
            }
        }
        return sum;
    }
}
