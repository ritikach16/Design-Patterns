package org.example.furnitures;

import org.example.AbstractFactory;
import org.example.decorations.Decorative;

public class FurnitureFactory extends AbstractFactory {

    @Override
    public Furniture getFurniture(String furnitureType) {
        if(furnitureType == null) {
            return null;
        } else if (furnitureType.equalsIgnoreCase("Modern Furniture")) {
            return new ModernFurniture();
        } else if (furnitureType.equalsIgnoreCase("Victorian Furniture")) {
            return new VictorianFurniture();
        }
        return null;
    }

    @Override
    public Decorative getDecorative(String decorativeType) {
        return null;
    }
}
