package com.joy.design_patterns.strategy.service.impl;

import com.joy.design_patterns.strategy.service.PaymentStrategy;

import java.math.BigDecimal;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paid: "+amount+" using UPI");
    }
}
