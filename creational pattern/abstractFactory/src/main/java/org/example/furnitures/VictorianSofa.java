package org.example.furnitures;

public class VictorianSofa implements Sofa{
    @Override
    public void sofaType() {
        System.out.println("This is Victorian Sofa");
    }

    @Override
    public void noOfPeopleCanSit() {
        System.out.println("Number of people can sit on this Victorian Sofa: 4");
    }

    @Override
    public int price() {
        return 900;
    }
}
