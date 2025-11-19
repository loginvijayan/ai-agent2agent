package com.vj.a2a.estore.seller.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerAgentTools {

	//Extends to access from Database
    private final List<Seller> sellerList =
            List.of( new Seller("1", "Kenady", "Australia", 7),
                    new Seller("2", "Vicky", "India", 9),
                    new Seller("3", "Robin", "London", 5),
                    new Seller("4", "Ren", "Japan", 4));


    @Tool(name = "Get Seller By Id", description = "Return seller by Id")
    public Seller getSellerById(
            @ToolParam(description = "Seller Id") String sellerId
    ) {
        return sellerList.stream()
                .filter(o -> o.sellerId.equals(sellerId))
                .findFirst()
                .orElse(null);
    }

    @Tool(name = "Get Seller By Name", description = "Return seller by name")
    public Seller getSellerByName(
            @ToolParam(description = "Seller Name") String sellerName
    ) {
        return sellerList.stream()
                .filter(o -> o.name.equals(sellerName))
                .findFirst()
                .orElse(null);
    }

    public record Seller(String sellerId, String name, String address, int rating) {}
}
