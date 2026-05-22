package com.joy.design_patterns.decorator;

import com.joy.design_patterns.decorator.service.Coffee;
import com.joy.design_patterns.decorator.service.impl.MilkDecorator;
import com.joy.design_patterns.decorator.service.impl.SimpleCoffee;
import com.joy.design_patterns.decorator.service.impl.WhipDecorator;

public class Main {
    public static void main(String[] args) {
        // plain coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " → ₹" + coffee.getCost());

        // coffee + milk
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " → ₹" + milkCoffee.getCost());

        // coffee + milk + sugar + whip
        Coffee fancyCoffee = new MilkDecorator(new WhipDecorator(milkCoffee));
        System.out.println(fancyCoffee.getDescription() + " → ₹" + fancyCoffee.getCost());
    }
}
