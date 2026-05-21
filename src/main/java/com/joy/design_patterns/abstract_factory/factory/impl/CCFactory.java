package com.joy.design_patterns.abstract_factory.factory.impl;

import com.joy.design_patterns.abstract_factory.service.Payment;
import com.joy.design_patterns.abstract_factory.service.Receipt;
import com.joy.design_patterns.abstract_factory.service.Validator;
import com.joy.design_patterns.abstract_factory.service.impl.cc.CCPayment;
import com.joy.design_patterns.abstract_factory.service.impl.cc.CCReceipt;
import com.joy.design_patterns.abstract_factory.service.impl.cc.CCValidator;

public class CCFactory {
    public Payment createPayment()     { return new CCPayment(); }
    public Validator createValidator() { return new CCValidator(); }
    public Receipt createReceipt()     { return new CCReceipt(); }
}
