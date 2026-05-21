package com.joy.design_patterns.simple_factory;

import com.joy.design_patterns.simple_factory.factory.PaymentFactory;
import com.joy.design_patterns.simple_factory.service.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment= PaymentFactory.initiatePay("upi");
        payment.pay(500);
    }
}