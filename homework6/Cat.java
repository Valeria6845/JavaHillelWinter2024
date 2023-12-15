package homework6;

public class Cat extends Animals{
    private static int cat_amount;

    public int getCat_amount() {
        return cat_amount;
    }
    public Cat() {
        cat_amount++;
    }
    @Override
    public void run (int obstacle_length) {
        if (obstacle_length < 200) {
            System.out.println("Cat ran "+obstacle_length+" m");
        }else {
            System.out.println("Too long distance. Max distance is 200 m");
        }
    }

    @Override
    public void swim(int obstacle_length) {
        System.out.println("Cat can't swim");
    }
}
