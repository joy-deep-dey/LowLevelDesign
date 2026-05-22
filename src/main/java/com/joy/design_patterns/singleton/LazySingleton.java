package com.joy.design_patterns.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton created");
    }

    public static LazySingleton getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1000);
            instance = new LazySingleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("LazySingleton @ " + hashCode());
    }
}
