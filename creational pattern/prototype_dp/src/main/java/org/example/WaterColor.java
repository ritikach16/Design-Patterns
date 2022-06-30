package org.example;

public class WaterColor extends Color{
    @Override
    void addColorType() {
        System.out.println("Add Water Color");
    }

    public WaterColor(){
        this.colorName = "Water Color";
    }
}
