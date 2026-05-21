package com.joy.design_patterns.abstract_factory.service.impl.upi;

import com.joy.design_patterns.abstract_factory.service.Validator;

public class UPIValidator implements Validator {
    public boolean validate(String details) {
        System.out.println("Validating UPI ID: " + details);
        return details.contains("@");
    }
}