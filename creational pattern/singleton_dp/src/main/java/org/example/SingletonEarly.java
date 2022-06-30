package org.example;

public class SingletonEarly {
    private static SingletonEarly singletonEarly = new SingletonEarly();
    private SingletonEarly(){}
    public static SingletonEarly getObj(){
        return singletonEarly;
    }
    public void showMessage(){
        System.out.println("Inside Singleton Early class");
    }
}
