package org.homework27;

public class Main {
    public static void main(String[] args) {
        Access access = new Access();
        Student student1 = new Student("Mark", "mark@mail.com");
        Student student2 = new Student("Jerry", "jerry@mail.com");
        Student student3 = new Student("Katrine", "katrine@mail.com");
        Student student4 = new Student("Lucy", "lucy@mail.com");
        Student student5 = new Student("George", "george@mail.com");
        Student student6 = new Student("Michael", "michael@mail.com");
        Student student7 = new Student("Annie", "annie@mail.com");
        access.persistStudent(student1);
        access.persistStudent(student2);
        access.persistStudent(student3);
        access.persistStudent(student4);
        access.persistStudent(student5);
        access.persistStudent(student6);
        access.persistStudent(student7);
        access.deleteStudent(6L);
        student2.setEmail("new@mail.com");
        access.updateStudent(student2);
        System.out.println(access.getStudents());
        System.out.println(access.getStudent(7L));
    }
}
