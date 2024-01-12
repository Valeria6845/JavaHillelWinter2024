package homework11.phonebook;

public class Entry {
    private String name;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public Entry(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
