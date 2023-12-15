package homework5;

public class Coworker {
    private String full_name;
    private String position;
    private String email;
    private String phone_number;
    private int age;

    public String getFull_name() {
        return full_name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getAge() {
        return age;
    }

    public Coworker (String full_name, String position, String email, String phone_number, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
    }
}
