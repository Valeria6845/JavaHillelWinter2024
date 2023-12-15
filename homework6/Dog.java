package homework6;

public class Dog extends Animals{
    private static int dogAmount;

    public int getDogAmount() {
        return dogAmount;
    }
    public Dog() {
        dogAmount++;
    }
    @Override
    public void run (int obstacleLength) {
        if (obstacleLength < 500) {
            System.out.println("Dog ran "+obstacleLength+" m");
        }else {
            System.out.println("Too long distance. Max run distance is 500 m");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength < 10) {
            System.out.println("Dog swam "+obstacleLength+" m");
        }else {
            System.out.println("Too long distance. Max swim distance is 10 m");
        }
    }
}
