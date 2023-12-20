package homework8;

public interface SubscriberService {
    public void showCityCallDurationExceedTheLimit(Subscriber[] list);
    public void showInterCityCallDuration(Subscriber[] list);
    public void showInformationByTheFirstLetter(Subscriber[] list, String firstLetter);
    public int calculateSumOfInternetTraffic(Subscriber[] list, String city);
    public int calculateSubsWithNegativeBalance(Subscriber[] list);
}
