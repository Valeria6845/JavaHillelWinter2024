package homework13.coffee_order;

public class Order {
    private int orderNumber;
    private String customer;
    public int getOrderNumber() {
        return orderNumber;
    }
    public String getCustomer() {
        return customer;
    }
    public Order(int orderNumber, String customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer='" + customer + '\'' +
                '}';
    }
}
