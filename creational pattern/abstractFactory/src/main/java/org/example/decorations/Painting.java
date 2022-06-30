package org.example.decorations;

public class Painting implements Decorative{
    @Override
    public void name() {
        System.out.println("Decorative item is Painting");
    }

    @Override
    public void price() {
        System.out.println("Price of Painting is : $100");
    }
}
