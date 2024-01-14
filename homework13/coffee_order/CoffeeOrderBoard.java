package homework13.coffee_order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class CoffeeOrderBoard {
    private int lastOrder;
    ArrayList<Integer> orders = new ArrayList<>();
private HashMap<Integer, Order> orderMap = new HashMap<>();
public boolean add(String customerName){
    lastOrder++;
        orders.add(lastOrder);
    orderMap.put(lastOrder, new Order(lastOrder, customerName));
    return true;
}
public Order deliver() {
    Order order = orderMap.get(orders.get(0));
    orderMap.remove(orders.get(0));
    orders.remove(0);
    return order;
}
public Order deliver(int number) {
    Order order = orderMap.get(orders.get(number-1));
    orderMap.remove(orders.get(number-1));
    orders.remove(number-1);
    return order;
}
public void draw() {
    for (Integer o: orders) {
        Order order = orderMap.get(o);
        System.out.println(order.getOrderNumber()+"|"+order.getCustomer());
    }
}
public void print() {
    System.out.println(orderMap);
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeOrderBoard that = (CoffeeOrderBoard) o;
        return Objects.equals(orderMap, that.orderMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderMap);
    }
}
