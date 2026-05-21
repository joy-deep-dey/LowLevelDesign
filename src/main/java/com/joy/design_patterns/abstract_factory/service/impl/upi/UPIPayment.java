package com.joy.design_patterns.abstract_factory.service.impl.upi;

import com.joy.design_patterns.abstract_factory.service.Payment;

public class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}