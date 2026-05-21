package com.joy.design_patterns.abstract_factory.service.impl.cc;

import com.joy.design_patterns.abstract_factory.service.Validator;

public class CCValidator implements Validator {
    public boolean validate(String details) {
        System.out.println("Validating card number: " + details);
        return details.length() == 16;
    }
}