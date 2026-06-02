package com.joy.design_patterns.template;

public class CsvProcessor extends DataProcessor{
    @Override
    protected void validateData() {
        System.out.println("CSV specific validation");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV records");
    }

    @Override
    protected void generateReport() {
        System.out.println("Generating CSV report");
    }
}
