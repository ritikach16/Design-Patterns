package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClothesFactory clothesFactory = new ClothesFactory();

        Clothes cloth1 = clothesFactory.getClothes("ETHNIC");
        cloth1.buy();

        Clothes cloth2 = clothesFactory.getClothes("FORMALS");
        cloth2.buy();

        Clothes cloth3 = clothesFactory.getClothes("WESTERN");
        cloth3.buy();
    }
}
