package org.example;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("Sketches", new Sketches());
        colorMap.put("Crayons Color", new Crayons());
        colorMap.put("Water Color", new WaterColor());
    }

    public static Color getColor(String colorName){
        return (Color) colorMap.get(colorName).clone();
    }
}
