package com.joy.design_patterns.singleton;

public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton instance;

    private DoubleLockSingleton(){
        System.out.println("DoubleCheckedSingleton created");
    }

    public static DoubleLockSingleton getInstance() throws InterruptedException {
        if(instance==null){
            Thread.sleep(1000);
            synchronized (DoubleLockSingleton.class){
                if(instance==null){
                    instance=new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("DoubleCheckedSingleton @ " + hashCode());
    }
}
