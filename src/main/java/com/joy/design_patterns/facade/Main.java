package com.joy.design_patterns.facade;

public class Main {
    public static void main(String[] args) {

        FoodDeliveryFacade facade =
                new FoodDeliveryFacade();

        facade.placeOrder();
    }
}
