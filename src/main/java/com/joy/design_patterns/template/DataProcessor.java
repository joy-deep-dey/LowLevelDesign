package com.joy.design_patterns.template;

public abstract class DataProcessor {

    private void readFile() {
        System.out.println("Reading file...");
    }

    protected void validateData() {
        System.out.println("Default validation");
    }

    protected abstract void processData();

    protected void generateReport() {
        System.out.println("Default report generation");
    }


    public final void execute() {

        readFile();

        validateData();

        processData();

        generateReport();
    }
}
