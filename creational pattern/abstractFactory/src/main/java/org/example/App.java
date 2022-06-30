package org.example;

import org.example.decorations.Decorative;
import org.example.furnitures.Furniture;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractFactory decorativeFactory = FactoryCreator.getFactory("Decorative");
        Decorative decorative = decorativeFactory.getDecorative("FlowerBas");

        decorative.name();
        decorative.price();

        System.out.println();

        AbstractFactory furnitureFactory = FactoryCreator.getFactory("Furniture");
        Furniture furniture = furnitureFactory.getFurniture("Victorian Furniture");
        System.out.println();
        furniture.getFurnitureDetail();
        furniture.getFurniturePrice();
    }
}
