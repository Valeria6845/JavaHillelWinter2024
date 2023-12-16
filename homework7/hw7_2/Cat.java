package homework7.hw7_2;

public class Cat extends Participant{
    private int maxRun = 60;
    private int maxJump = 2;
    private boolean cantDo;
    public boolean isCantDo() {
        return cantDo;
    }
    public int getMaxRun() {
        return maxRun;
    }
    public int getMaxJump() {
        return maxJump;
    }
    @Override
    public String choice (int type, int size) {
        String a = "";
        if (type == 1) {
            if (size <= maxRun) {
                a = Cat.run();

            }else {
                a = "Cat didn't ran ";
                this.cantDo = true;
            }
        }
        if (type == 2) {
            if (size <= maxJump) {
                a = Cat.jump();
            }else {
                a = "Cat didn't jump ";
                this.cantDo = true;
            }
        }
        return a;
    }
    protected static String run() {
        return "Cat ran ";
    }
    protected static String jump() {
        return "Cat jumped over ";
    }
}
