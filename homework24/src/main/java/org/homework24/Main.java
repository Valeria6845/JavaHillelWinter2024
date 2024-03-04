package org.homework24;

import java.util.List;
import com.google.gson.Gson;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {
        List<Product> order = List.of(
                new Product("sausage", 10),
                new Product("bread", 5),
                new Product("sauce", 15));
        List<Product> order1 = List.of(
                new Product("a", 10),
                new Product("b", 20),
                new Product("c", 50));
        OrderRepository or = new OrderRepository();
        or.addOrder(order);
        or.addOrder(order1);
        //http://localhost:4567/orders
        get("/orders", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(or.getAllOrders());
        });
        get("/orders/:id", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(or.getOrderById(Integer.parseInt(request.params(":id"))));
        });
    }
}
