package com.joy.design_patterns.factory_method.factory.impl;

import com.joy.design_patterns.factory_method.factory.PaymentProcessor;
import com.joy.design_patterns.factory_method.service.Payment;
import com.joy.design_patterns.factory_method.service.impl.UPI;

public class UPIProcessor extends PaymentProcessor {
    @Override
    public Payment initiatePayment() {
        return new UPI();
    }
}
