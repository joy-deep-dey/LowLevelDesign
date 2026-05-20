package com.joy.design_patterns.strategy;

import com.joy.design_patterns.strategy.controller.ShoppingCart;
import com.joy.design_patterns.strategy.service.impl.CreditCardPaymentStrategy;
import com.joy.design_patterns.strategy.service.impl.UPIPaymentStrategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setPaymentStrategy(new UPIPaymentStrategy());
        shoppingCart.checkout(BigDecimal.valueOf(500));

        shoppingCart.setPaymentStrategy(new CreditCardPaymentStrategy());
        shoppingCart.checkout(BigDecimal.valueOf(400));
    }
}
