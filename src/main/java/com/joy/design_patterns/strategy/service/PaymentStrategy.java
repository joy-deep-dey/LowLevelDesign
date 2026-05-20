package com.joy.design_patterns.strategy.service;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal amount);
}
