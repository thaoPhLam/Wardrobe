package com.codecool.thao.wardrobe.app;

import com.codecool.thao.wardrobe.Wardrobe;
import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothPart;
import com.codecool.thao.wardrobe.cloth.ClothType;
import com.codecool.thao.wardrobe.hanger.DoubleHanger;
import com.codecool.thao.wardrobe.hanger.Hanger;
import com.codecool.thao.wardrobe.hanger.SingleHanger;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        Cloth blouse = new Cloth(ClothType.BLOUSE, ClothPart.UPPER);
        Cloth jeans = new Cloth(ClothType.JEANS, ClothPart.BOTTOM);
        Cloth shirt = new Cloth(ClothType.SHIRT, ClothPart.UPPER);
        Cloth skirt = new Cloth(ClothType.SKIRT, ClothPart.BOTTOM);

        Hanger singleHanger = new SingleHanger();
        singleHanger.putOntoCloth(blouse);
        singleHanger.putOntoCloth(shirt);
        singleHanger.putOntoCloth(skirt);  //TODO: print out: it's not a TOP

        Hanger doubleHanger = new DoubleHanger();
        doubleHanger.putOntoCloth(jeans);
        //doubleHanger.putOntoCloth(skirt);

        doubleHanger.putOntoCloth(shirt);
        doubleHanger.putOntoCloth(blouse);
        doubleHanger.putOntoCloth(skirt);  //TODO: reordering...

        wardrobe.hangHanger(singleHanger);
        wardrobe.hangHanger(doubleHanger);

        wardrobe.isTherePlaceFor();
        //wardrobe.printOutHangers();

        System.out.println("I'm taking this out: " + wardrobe.takeOutCloth(3));
        //System.out.println("I'm taking ALL out: " + doubleHanger.takeAllClothingOff());
        //System.out.println("I'm taking ALL out: " + singleHanger.takeAllClothingOff());

    }
}
