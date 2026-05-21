package com.joy.design_patterns.factory_method.factory;

import com.joy.design_patterns.simple_factory.service.Payment;
import com.joy.design_patterns.simple_factory.service.impl.CreditCard;
import com.joy.design_patterns.simple_factory.service.impl.UPI;

public class PaymentFactory {
    public static Payment initiatePay(String type){
        switch (type){
            case "upi": return new UPI();
            case "cc": return new CreditCard();
            default: throw new IllegalArgumentException("Unknow Payment Type");
        }
    }
}
