package com.joy.design_patterns.abstract_factory.service.impl.cc;

import com.joy.design_patterns.abstract_factory.service.Receipt;
import com.joy.design_patterns.abstract_factory.service.Validator;

public class CCReceipt implements Receipt {
    public void generate(double amount) {
        System.out.println("Credit Card Receipt generated for ₹" + amount);
    }
}

