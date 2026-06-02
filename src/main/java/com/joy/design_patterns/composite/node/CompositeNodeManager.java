package com.joy.design_patterns.composite.node;

import java.util.ArrayList;
import java.util.List;

public class CompositeNodeManager implements Employee{
    private String name;

    private List<Employee> employees =
            new ArrayList<>();

    public CompositeNodeManager(String name) {
        this.name = name;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("\nManager : " + name);

        for(Employee employee : employees) {
            employee.showDetails();
        }
    }
}
