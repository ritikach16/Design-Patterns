package org.example.decorations;

public class FlowerBas implements Decorative{
    @Override
    public void name() {
        System.out.println("Decorative item is FlowerBas");
    }

    @Override
    public void price() {
        System.out.println("Price of FlowerBas is : $20");
    }
}
