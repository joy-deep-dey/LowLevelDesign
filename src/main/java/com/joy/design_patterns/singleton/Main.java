package com.joy.design_patterns.singleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== 1. Eager ===");
        EagerThreadSafeSingleton e1 = EagerThreadSafeSingleton.getInstance();
        EagerThreadSafeSingleton e2 = EagerThreadSafeSingleton.getInstance();
        e1.show();
        e2.show();
        System.out.println("Same? " + (e1 == e2));

        System.out.println("\n=== 2. Lazy ===");
        Runnable task = () -> {
          try{
              LazySingleton singleton = LazySingleton.getInstance();
              singleton.show();
          } catch (Exception e){
              throw new RuntimeException(e);
          }
        };
        Thread t1 = new Thread(task);
        Thread t2= new Thread(task);
        t1.start(); t2.start();

        Thread.sleep(3000);

        System.out.println("\n=== 3. Thread-Safe Single Lock ===");
        Runnable task1 = () -> {
            try{
                SingleLockSingleton singleton = SingleLockSingleton.getInstance();
                singleton.show();
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        };
        Thread t3 = new Thread(task1);
        Thread t4= new Thread(task1);
        t3.start(); t4.start();

        Thread.sleep(3000);

        System.out.println("\n=== 4. Double Checked Lock ===");
        Runnable task2 = () -> {
            try{
                DoubleLockSingleton singleton = DoubleLockSingleton.getInstance();
                singleton.show();
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        };
        Thread t5 = new Thread(task2);
        Thread t6= new Thread(task2);
        t5.start(); t6.start();

    }
}
