package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        cartItems.add(item);
    }

    public void removeItem(Item item) {
        cartItems.remove(item);
    }

    public int getCartSize() {
        return cartItems.size();
    }
    
    public List<Item> viewItemsInCart() {
        return new ArrayList<>(cartItems);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : cartItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

