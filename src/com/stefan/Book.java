package com.stefan;

import java.util.ArrayList;

public class Book implements ShopItem {

    private String name;
    private double price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void addToCart(ArrayList<ShopItem> shoppingCart) {
        System.out.println("Book: " + name + " was added to the cart. The value is " + price);
        shoppingCart.add(this);
    }

    @Override
    public void sendTo(Customer customer) {
        System.out.println("The book: " + name + " was sent to the address:" + customer.getAddress());
    }
}
