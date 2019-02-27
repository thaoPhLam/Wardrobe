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
        singleHanger.putOntoCloth(skirt);

        Hanger doubleHanger = new DoubleHanger();
        doubleHanger.putOntoCloth(jeans);
        //doubleHanger.putOntoCloth(skirt);

        doubleHanger.putOntoCloth(shirt);
        doubleHanger.putOntoCloth(blouse);
        doubleHanger.putOntoCloth(skirt);

        wardrobe.hangHanger(singleHanger);
        wardrobe.hangHanger(doubleHanger);
        wardrobe.hangHanger(new DoubleHanger());

        wardrobe.isTherePlaceForHanger();

        Cloth shirt2 = new Cloth(ClothType.SHIRT);
        wardrobe.isTherePlaceFor(shirt2);

        System.out.println("I'm taking this out: " + wardrobe.takeOutCloth(2)); // TODO: figure out why id is something else
        System.out.println("I'm taking ALL out: " + doubleHanger.takeAllClothingOff());
        System.out.println("I'm taking ALL out: " + singleHanger.takeAllClothingOff());

    }
}
