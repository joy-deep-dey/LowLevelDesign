package com.joy.design_patterns.singleton;

public class EagerThreadSafeSingleton {
    private static final EagerThreadSafeSingleton INSTANCE = new EagerThreadSafeSingleton();

    private EagerThreadSafeSingleton(){
        System.out.println("Singleton Created");
    }

    public static EagerThreadSafeSingleton getInstance(){
        return INSTANCE;
    }

    public void show(){
        System.out.println(hashCode());
    }
}
