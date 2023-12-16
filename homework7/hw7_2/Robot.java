package homework7.hw7_2;

public class Robot extends Participant{

    private int maxRun = 500;

    private int maxJump = 5;
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
                a = Robot.run();
            }else {
                a = "Robot didn't ran ";
                this.cantDo = true;
            }
        }
        if (type == 2) {
            if (size <= maxJump) {
                a = Robot.jump();
            }else {
                a = "Robot didn't jump ";
                this.cantDo = true;
            }
        }
        return a;
    }
    protected static String run() {
        return "Robot ran ";
    }
    protected static String jump() {
        return "Robot jumped over ";
    }
}
