package homework7.hw7_1;

public class Triangle implements Area{
    @Override
    public double calculateArea(int a, int h) {
        return (double) (a * h) /2;
    }
}
