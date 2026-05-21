package com.joy.design_patterns.factory_method;

import com.joy.design_patterns.factory_method.factory.PaymentProcessor;
import com.joy.design_patterns.factory_method.factory.impl.CCProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CCProcessor();
        paymentProcessor.processPayment(400);
    }
}
