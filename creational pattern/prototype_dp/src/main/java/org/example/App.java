package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ColorStore.getColor("Crayons Color").addColorType();
        ColorStore.getColor("Water Color").addColorType();
        ColorStore.getColor("Sketches").addColorType();
        ColorStore.getColor("Water Color").addColorType();
    }
}
