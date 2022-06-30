package org.example;

public class Crayons extends Color {

    public Crayons(){
        this.colorName = "Crayons Color";
    }

    @Override
    void addColorType(){
        System.out.println("Add Crayons Color");
    }
}
