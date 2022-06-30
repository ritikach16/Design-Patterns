package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // EARLY INSTANTIATION
        SingletonEarly singletonEarly = SingletonEarly.getObj();
        singletonEarly.showMessage();

        // LAZY INSTANTIATION
        SingletonLazy singletonLazy = SingletonLazy.getObj();
        singletonLazy.showMessage();
    }
}
