package homework7.hw7_2;

public class Human extends Participant{
    private int maxRun = 200;

    private int maxJump = 1;
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
                a = Human.run();
            }else {
                a = "Human didn't ran ";
                this.cantDo = true;
            }
        }
        if (type == 2) {
            if (size <= maxJump) {
                a = Human.jump();
            }else {
                a = "Human didn't jump ";
                this.cantDo = true;
            }
        }
        return a;
    }

    protected static String run() {
        return "Human ran ";
    }

    protected static String jump() {
        return "Human jumped over ";
    }
}
