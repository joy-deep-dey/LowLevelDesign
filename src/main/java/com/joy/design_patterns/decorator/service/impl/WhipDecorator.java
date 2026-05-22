package com.joy.design_patterns.decorator.service.impl;

import com.joy.design_patterns.decorator.service.Coffee;
import com.joy.design_patterns.decorator.service.CoffeeDecorator;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Whip";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 15.0;
    }
}
