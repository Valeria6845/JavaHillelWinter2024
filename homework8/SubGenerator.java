package homework8;

public class SubGenerator {
    public static Subscriber[] generateList() {
        Subscriber[] list = new Subscriber[5];
        list[0] = new Subscriber(1, "Liam", "Anderson", "New York", "5197358346", 35426789, -3, 153, 0, 2);
        list[1] = new Subscriber(2, "Mina", "Brown", "San-Francisco", "3287652492", 81543529, 123, 256, 0, 5);
        list[2] = new Subscriber(3, "Jerry", "Pines", "New York", "3845219627", 48512586, 425, 327, 98, 4);
        list[3] = new Subscriber(4, "Katrin", "Northwest", "California", "2148563843", 12489455, 99, 120, 85, 1);
        list[4] = new Subscriber(5, "Cody", "Parker", "San-Francisco", "4123854627", 426125681, -75, 237, 38, 3);
        return list;
    }
}
