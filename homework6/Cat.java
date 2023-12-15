package homework6;

public class Cat extends Animals{
    private static int catAmount;

    public int getCatAmount() {
        return catAmount;
    }
    public Cat() {
        catAmount++;
    }
    @Override
    public void run (int obstacleLength) {
        if (obstacleLength < 200) {
            System.out.println("Cat ran "+obstacleLength+" m");
        }else {
            System.out.println("Too long distance. Max distance is 200 m");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println("Cat can't swim");
    }
}
