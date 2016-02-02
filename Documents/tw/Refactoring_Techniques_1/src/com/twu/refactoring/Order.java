package com.twu.refactoring;

import java.util.List;

public class Order {
    private String name;
    private String address;
    List<LineItem> lineItems;

    public Order(String name, String address, List<LineItem> lineItems) {
        this.name = name;
        this.address = address;
        this.lineItems = lineItems;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public String printCustomerDetails() {
        return this.name + "\n" + this.address;
    }

    public String printLineItems() {
        String items = "";

        for(LineItem item : lineItems){
            items += item.toString();
        }

        return items;
    }
}
