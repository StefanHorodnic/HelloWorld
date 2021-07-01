package com.stefan;

import java.util.ArrayList;

public class Main {

    private static Customer customer = new Customer();
    private static ArrayList<ShopItem> shoppingCart = new ArrayList<>();

    public static void main(String[ ] args) {
        createFakeCustomer();
        addFakeItemsToCart();
        sendItems();
    }

    public static void createFakeCustomer(){
        customer.setFirstName("Stefan");
        customer.setLastName("Horodnic");
        customer.setEmail("stefanhorodnic@yahoo.com");
        customer.setAddress("str. mesteacanului nr. 1, Suceava, Romania");
    }

    public static void addFakeItemsToCart(){
        Book book = new Book();
        book.setName("The Java Book");
        book.setPrice(34.78);

        Movie movie = new Movie();
        movie.setName("Matrix");
        movie.setPrice(57.99);

        book.addToCart(shoppingCart);
        movie.addToCart(shoppingCart);
    }

    public static void sendItems(){
        for (ShopItem item : shoppingCart) {
            item.sendTo(customer);
        }
    }
}
