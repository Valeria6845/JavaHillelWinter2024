package homework11;

public class Element {
    private String name;
    private int occurrence;

    public Element(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
