package com.joy.design_patterns.strategy.controller;

import com.joy.design_patterns.strategy.service.PaymentStrategy;

import java.math.BigDecimal;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void checkout(BigDecimal amount){
        paymentStrategy.pay(amount);
    }
}
