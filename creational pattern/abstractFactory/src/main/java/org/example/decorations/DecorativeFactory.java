package org.example.decorations;

import org.example.AbstractFactory;
import org.example.furnitures.Furniture;

public class DecorativeFactory extends AbstractFactory {
    @Override
    public Furniture getFurniture(String furnitureType) {
        return null;
    }

    @Override
    public Decorative getDecorative(String decorativeType) {
        if(decorativeType == null){
            return null;
        } else if (decorativeType.equalsIgnoreCase("FlowerBas")) {
            return new FlowerBas();
        } else if (decorativeType.equalsIgnoreCase("Painting")) {
            return new Painting();
        }
        return null;
    }
}
