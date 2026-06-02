package com.joy.design_patterns.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CSV ===");
        DataProcessor csv =
                new CsvProcessor();
        csv.execute();

        System.out.println();

        System.out.println("=== JSON ===");
        DataProcessor json =
                new JsonProcessor();
        json.execute();
    }
}
