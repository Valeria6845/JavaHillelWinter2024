package homework6;

public class Dog extends Animals{
    private static int dog_amount;

    public int getDog_amount() {
        return dog_amount;
    }
    public Dog() {
        dog_amount++;
    }
    @Override
    public void run (int obstacle_length) {
        if (obstacle_length < 500) {
            System.out.println("Dog ran "+obstacle_length+" m");
        }else {
            System.out.println("Too long distance. Max run distance is 500 m");
        }
    }

    @Override
    public void swim(int obstacle_length) {
        if (obstacle_length < 10) {
            System.out.println("Dog swam "+obstacle_length+" m");
        }else {
            System.out.println("Too long distance. Max swim distance is 10 m");
        }
    }
}
