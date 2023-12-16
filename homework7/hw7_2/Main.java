package homework7.hw7_2;

public class Main {
    public static void main(String[] args) {
        Participant[] part = {new Human(), new Cat(), new Robot()};
        Obstacle[] obst = {new Racetrack(), new Wall()};
        int distance = 0;
        for (int i = 0; i < obst.length; i++) {
            distance += obst[i].getLength();
            for (int j = 0; j < part.length; j++) {
                if (part[j].isCantDo()) {
                    continue;
                }
                obst[i].overcome(part[j].choice(obst[i].getType(),obst[i].getSize()));
                    System.out.println("on distance "+distance);
            }
        }
    }
}
