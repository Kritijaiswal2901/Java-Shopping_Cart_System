package com.example;

public class Main {
    public static void main(String[] args) {

        Item iphone = new Item(1, "Iphone", 100000);
        Item smartphone = new Item(2, "SmartPhone", 50000);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(iphone);
        shoppingCart.addItem(smartphone);

        System.out.println("Items in the Cart:");
        for (Item item : shoppingCart.viewItemsInCart()) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
        }

        System.out.println("Total Price: $" + shoppingCart.calculateTotalPrice());
    }
}
