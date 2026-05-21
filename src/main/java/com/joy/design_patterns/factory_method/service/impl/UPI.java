package com.joy.design_patterns.factory_method.service.impl;

import com.joy.design_patterns.factory_method.service.Payment;

public class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
