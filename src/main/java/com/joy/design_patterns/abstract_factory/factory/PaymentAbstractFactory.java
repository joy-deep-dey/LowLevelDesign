package com.joy.design_patterns.abstract_factory.factory;

import com.joy.design_patterns.abstract_factory.service.Payment;
import com.joy.design_patterns.abstract_factory.service.Receipt;
import com.joy.design_patterns.abstract_factory.service.Validator;

public interface PaymentAbstractFactory {
    Payment createPayment();
    Validator createValidator();
    Receipt createReceipt();
}
