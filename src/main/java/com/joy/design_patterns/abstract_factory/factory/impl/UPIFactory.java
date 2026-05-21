package com.joy.design_patterns.abstract_factory.factory.impl;

import com.joy.design_patterns.abstract_factory.factory.PaymentAbstractFactory;
import com.joy.design_patterns.abstract_factory.service.Payment;
import com.joy.design_patterns.abstract_factory.service.Receipt;
import com.joy.design_patterns.abstract_factory.service.Validator;
import com.joy.design_patterns.abstract_factory.service.impl.upi.UPIPayment;
import com.joy.design_patterns.abstract_factory.service.impl.upi.UPIReceipt;
import com.joy.design_patterns.abstract_factory.service.impl.upi.UPIValidator;

public class UPIFactory implements PaymentAbstractFactory {
    public Payment createPayment()     { return new UPIPayment(); }
    public Validator createValidator() { return new UPIValidator(); }
    public Receipt createReceipt()     { return new UPIReceipt(); }
}
