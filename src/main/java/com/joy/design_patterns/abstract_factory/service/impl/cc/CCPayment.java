package com.joy.design_patterns.abstract_factory.service.impl.cc;

import com.joy.design_patterns.abstract_factory.service.Payment;

public class CCPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
}