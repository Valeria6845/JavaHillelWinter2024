package homework11.phonebook;

import java.util.ArrayList;

public class PhoneDirectory {
    private ArrayList<Entry> entry = new ArrayList<>();
    public void add(String name, int phoneNumber) {
        entry.add(new Entry(name, phoneNumber));
    }
    public Entry find(String name) {
        for (Entry o: entry) {
            if (o.getName().equals(name)) {
                return o;
            }
        }
        return new Entry("", 0);
    }
    public ArrayList<Entry> findAll(String name) {
        int check = 0;
        ArrayList<Entry> entry2 = new ArrayList<>();
        for (Entry o: entry) {
            if (o.getName().equals(name)) {
                entry2.add(o);
                check++;
            }
        }
        if (check > 0) {
            return entry2;
        }
        return new ArrayList<>();
    }
    public void print() {
        System.out.println(entry);
    }
}
