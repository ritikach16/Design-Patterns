package org.example;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;
    private SingletonLazy(){}

    public static SingletonLazy getObj(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }

    public void showMessage(){
        System.out.println("Inside Singleton Lazy class");
    }
}
