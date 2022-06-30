package org.example.furnitures;

public class VictorianFurniture implements Furniture {
    Chair chair;
    Sofa sofa;
    @Override
    public void getFurnitureDetail() {

            sofa = new VictorianSofa();
            chair = new VictorianChair();

        sofa.price();
        sofa.sofaType();
        sofa.noOfPeopleCanSit();


        chair.price();
        chair.chairType();
        chair.noOfPeopleCanSit();
    }

    @Override
    public void getFurniturePrice() {
       int actualPrice = sofa.price() + chair.price();
        System.out.println("Total price of VictorianFurniture $"+actualPrice);
    }
}
