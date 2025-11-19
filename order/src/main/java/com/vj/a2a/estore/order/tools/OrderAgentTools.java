package com.vj.a2a.estore.order.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderAgentTools {

	//Extends to access from Database
    private final List<Order> orders =
            List.of( new Order("1", "B2B", "1", 103.50, "Yugan"),
                    new Order("2", "B2B", "2", 54.75,"Kamal"),
                    new Order("3", "B2C", "3", 10.00,"VJ"),
                    new Order("4", "B2C", "4", 430.00,"Jhon"),
                    new Order("5", "B2B", "2", 230.00,"Dommy"),
                    new Order("6", "B2C", "4", 780.00,"SV Kids"));

    @Tool(name = "Get All Orders", description = "Returns all B2B orders")
    public List<Order> getAllOrders() {
        return orders.stream()
                .toList();

    }
    @Tool(name = "Get B2B Orders", description = "Returns all B2B orders")
    public List<Order> getB2BOrders() {
        return orders.stream()
                .filter(o -> o.type().equalsIgnoreCase("B2B")).toList();

    }

    @Tool(name = "Get B2C Orders", description = "Returns all B2C orders")
    public List<Order> getB2COrders() {
        return orders.stream()
                .filter(o -> o.type().equalsIgnoreCase("B2C")).toList();
    }

    public record Order(String id, String type, String sellerId, double amount, String customerName) {}
}
