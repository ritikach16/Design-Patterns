package org.example.furnitures;

public class ModernSofa implements Sofa{
    @Override
    public void sofaType() {
        System.out.println("This is Modern Sofa");
    }

    @Override
    public void noOfPeopleCanSit() {
        System.out.println("Number of people can sit on this Modern Sofa: 4");
    }

    @Override
    public int price() {
       return 800;
    }
}
