package homework7.hw7_1;

public class Circle implements Area{
    @Override
    public double calculateArea(int r, int empty) {
        return 3.14 * r*r;
    }
}
