package org.example;

import org.example.decorations.DecorativeFactory;
import org.example.furnitures.FurnitureFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("Furniture")){
            return new FurnitureFactory();
        }
        if(factoryName.equalsIgnoreCase("Decorative")){
            return new DecorativeFactory();
        }
        return null;
    }
}
