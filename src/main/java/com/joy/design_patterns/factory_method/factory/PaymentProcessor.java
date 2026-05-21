package com.joy.design_patterns.factory_method.factory;

import com.joy.design_patterns.factory_method.service.Payment;
import com.joy.design_patterns.factory_method.service.impl.UPI;

public abstract class PaymentProcessor {
    public abstract Payment initiatePayment();

    public void processPayment(double amount) {
        Payment payment = initiatePayment();  // delegates creation to subclass
        payment.pay(amount);
        System.out.println("Payment processed successfully.");
    }
}
