package org.coffee_order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Run {
    private static final Logger logInfo = LoggerFactory.getLogger("logger.info");
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Lucy");
        board.add("Andy");
        board.add("James");
        board.add("Mark");
        board.add("Jeremy");
        logInfo.info("Orders added: "+"\n {}", board.draw());
        System.out.println(board.draw());
        Order del = board.deliver();
        logInfo.info("Order delivered: {}", del.toString());
        System.out.println(board.draw());
        Order delByNum = board.deliver(3);
        System.out.println(delByNum);
        logInfo.info("Order delivered: {}", delByNum.toString());
        System.out.println(board.draw().toString());

    }
}
