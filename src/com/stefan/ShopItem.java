package com.stefan;

import java.util.ArrayList;

public interface ShopItem {

    String getName();
    void setName(String name);

    double getPrice();
    void setPrice(double price);

    void addToCart(ArrayList<ShopItem> shoppingCart);

    void sendTo(Customer customer);

}
