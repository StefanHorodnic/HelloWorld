package com.stefan;

import java.util.ArrayList;

public interface IShopItem {

    String getName();
    void setName(String name);

    double getPrice();
    void setPrice(double price);

    void addToCart(ArrayList<IShopItem> shoppingCart);

    void sendTo(Customer customer);

}
