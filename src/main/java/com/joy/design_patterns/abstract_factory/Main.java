package com.joy.design_patterns.abstract_factory;

import com.joy.design_patterns.abstract_factory.factory.PaymentAbstractFactory;
import com.joy.design_patterns.abstract_factory.factory.impl.UPIFactory;
import com.joy.design_patterns.abstract_factory.service.impl.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentAbstractFactory factory = new UPIFactory();
        PaymentService service = new PaymentService(factory);
        service.process("user@oksbi", 1500.00);
    }
}
