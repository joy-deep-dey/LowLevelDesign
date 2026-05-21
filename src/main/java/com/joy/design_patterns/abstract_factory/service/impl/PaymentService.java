package com.joy.design_patterns.abstract_factory.service.impl;

import com.joy.design_patterns.abstract_factory.factory.PaymentAbstractFactory;
import com.joy.design_patterns.abstract_factory.service.Payment;
import com.joy.design_patterns.abstract_factory.service.Receipt;
import com.joy.design_patterns.abstract_factory.service.Validator;

public class PaymentService {

    private final Payment payment;
    private final Validator validator;
    private final Receipt receipt;

    // factory decides the whole family
    public PaymentService(PaymentAbstractFactory factory) {
        this.payment   = factory.createPayment();
        this.validator = factory.createValidator();
        this.receipt   = factory.createReceipt();
    }

    public void process(String details, double amount) {
        if (validator.validate(details)) {
            payment.pay(amount);
            receipt.generate(amount);
        } else {
            System.out.println("Validation failed!");
        }
    }
}