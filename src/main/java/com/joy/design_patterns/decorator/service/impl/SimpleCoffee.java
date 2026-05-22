package com.joy.design_patterns.decorator.service.impl;

import com.joy.design_patterns.decorator.service.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
