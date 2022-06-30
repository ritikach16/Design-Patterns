package org.example;

public class ClothesFactory {
    public Clothes getClothes(String clothType){

        if(clothType.equalsIgnoreCase("WESTERN")){
            return new Western();
        }
        if(clothType.equalsIgnoreCase("ETHNIC")){
            return new Ethnic();
        }
        if(clothType.equalsIgnoreCase("FORMALS")){
            return new Formals();
        }

        return null;
    }
}
