package homework15;

import java.util.ArrayList;
import java.util.Random;

public class Captcha {
    private Numbers num = new Numbers();
    ArrayList<Integer> number = new ArrayList<>();
private String[] callNum(int n) {
    String[] number = null;
    switch (n) {
        case 0:
            number = num.getZero();
            break;
        case 1:
            number = num.getOne();
            break;
        case 2:
            number = num.getTwo();
            break;
        case  3:
            number = num.getThree();
            break;
        case 4:
            number = num.getFour();
            break;
        case 5:
            number = num.getFive();
            break;
        case 6:
            number = num.getSix();
            break;
        case 7:
            number = num.getSeven();
            break;
        case 8:
            number = num.getEight();
            break;
        case 9:
            number = num.getNine();
            break;
    }
    return number;
}
    public void print() {
        Captcha cap = new Captcha();
        Random rand = new Random();
        int amount = rand.nextInt(9)+1;
        for (int i = 0; i < amount; i ++) {
            number.add(rand.nextInt(9));
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print(cap.callNum(number.get(j))[i]+"   ");
            }
            System.out.println(" ");
        }
    }
    public boolean check(String input) {
    String check ="";
    for (Integer o: number) {
        check = check + o;
    }
    if (check.equals(input)) {
        return true;
    }
    return false;
    }
}
