package com.joy.design_patterns.singleton;

public class SingleLockSingleton {
    private static SingleLockSingleton instance;

    private SingleLockSingleton(){
        System.out.println("ThreadSafeSingleton created");
    }

    public static synchronized SingleLockSingleton getInstance() throws InterruptedException {
        if(instance==null){
            Thread.sleep(1000);
            instance=new SingleLockSingleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("ThreadSafeSingleton @ " + hashCode());
    }
}
