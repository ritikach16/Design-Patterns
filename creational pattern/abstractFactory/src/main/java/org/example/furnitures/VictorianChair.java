package org.example.furnitures;

public class VictorianChair implements Chair{
    @Override
    public void chairType() {
        System.out.println("This is Victorian Chair");
    }

    @Override
    public void noOfPeopleCanSit() {
        System.out.println("Number of people can sit on this Victorian chair: 1");
    }

    @Override
    public int price() {
        return 200;
    }
}
