package com.joy.design_patterns.simple_factory.service.impl;

import com.joy.design_patterns.simple_factory.service.Payment;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
}
