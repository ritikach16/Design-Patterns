package org.example.furnitures;
import java.util.ArrayList;
import java.util.List;
public class ModernFurniture implements Furniture {
    Chair chair;
    Sofa sofa;
    @Override
    public void getFurnitureDetail() {
         sofa = new ModernSofa();
         chair = new ModernChair();

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
        System.out.println("Total price of ModernFurniture $"+actualPrice);
    }
}
