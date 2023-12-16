package homework7.hw7_1;

public class Main {
    public static void main(String[] args) {
        Area[] figures = {new Circle(), new Square(), new Triangle()};
        double sum = 0;
        for (Area o: figures) {
            sum += o.calculateArea(3, 2);
        }
        System.out.println(sum);
    }
}
