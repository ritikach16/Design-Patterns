package org.example.furnitures;

public class ModernChair implements Chair{
    @Override
    public void chairType() {
        System.out.println("This is Modern chair");
    }

    @Override
    public void noOfPeopleCanSit() {
        System.out.println("Number of people can sit on this Modern chair: 1");
    }

    @Override
    public int price() {
        return 100;
    }
}
