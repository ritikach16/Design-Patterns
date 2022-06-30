package org.example;

import org.example.decorations.Decorative;
import org.example.furnitures.Furniture;

public abstract class AbstractFactory {
    public abstract Furniture getFurniture(String furnitureType);
    public abstract Decorative getDecorative(String decorativeType);
}
