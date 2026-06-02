package com.joy.design_patterns.composite.node;

public class LeafNodeDeveloper implements Employee{
    private String name;

    public LeafNodeDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer : "+name);
    }
}
