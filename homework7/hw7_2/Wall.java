package homework7.hw7_2;

public class Wall extends Obstacle{
    private int length = 2;
    private int size = 3;
    private int type = 2;
    public int getLength() {
        return length;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public int getType() {
        return type;
    }
    @Override
    public void overcome(String action) {
        System.out.println(action+"the wall");
    }
}
