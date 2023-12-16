package homework7.hw7_2;

public class Racetrack extends Obstacle{
    private int length = 200;
    private int size = 200;
    private int type = 1;
    @Override
    public int getLength() {
        return length;
    }
    public int getSize() {
        return size;
    }
    public int getType() {
        return type;
    }
    @Override
    public void overcome(String action) {
        System.out.println(action+"the racetrack");
    }
}
