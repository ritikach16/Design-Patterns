package org.example;

public class NonVegBurger extends Burger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Non Veg Burger";
    }
}
