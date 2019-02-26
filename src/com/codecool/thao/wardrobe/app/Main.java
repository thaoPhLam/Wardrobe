package com.codecool.thao.wardrobe.app;

import com.codecool.thao.wardrobe.Wardrobe;
import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothType;
import com.codecool.thao.wardrobe.hanger.DoubleHanger;
import com.codecool.thao.wardrobe.hanger.Hanger;
import com.codecool.thao.wardrobe.hanger.SingleHanger;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        Cloth blouse = new Cloth(ClothType.BLOUSE);
        Cloth jeans = new Cloth(ClothType.JEANS);
        Cloth shirt = new Cloth(ClothType.SHIRT);
        Cloth skirt = new Cloth(ClothType.SKIRT);

        Hanger singleHanger = new SingleHanger();
        singleHanger.putOntoCloth(blouse);
        singleHanger.putOntoCloth(shirt);

        Hanger doubleHanger = new DoubleHanger();
        doubleHanger.putOntoCloth(jeans);
        doubleHanger.putOntoCloth(shirt);

        wardrobe.hangHanger(singleHanger);
        wardrobe.hangHanger(doubleHanger);

        wardrobe.isTherePlaceFor();
        wardrobe.printOutHangers();

        System.out.println("I'm taking this out: " + wardrobe.takeOutCloth(3));
        System.out.println("I'm taking ALL out: " + doubleHanger.takeAllClothingOff());
        System.out.println("I'm taking ALL out: " + singleHanger.takeAllClothingOff());

    }
}
