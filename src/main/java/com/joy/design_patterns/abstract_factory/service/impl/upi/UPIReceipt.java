package com.joy.design_patterns.abstract_factory.service.impl.upi;

import com.joy.design_patterns.abstract_factory.service.Receipt;

public class UPIReceipt implements Receipt {
    public void generate(double amount) {
        System.out.println("UPI Receipt generated for ₹" + amount);
    }
}
