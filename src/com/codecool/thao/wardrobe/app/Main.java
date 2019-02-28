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

        Hanger singleHanger = new SingleHanger();
        singleHanger.putOntoCloth(new Cloth(ClothType.BLOUSE, ClothPart.UPPER));
        singleHanger.putOntoCloth(new Cloth(ClothType.SHIRT, ClothPart.UPPER));
        singleHanger.putOntoCloth(new Cloth(ClothType.SKIRT, ClothPart.BOTTOM));

        Hanger doubleHanger = new DoubleHanger();
        doubleHanger.putOntoCloth(new Cloth(ClothType.JEANS, ClothPart.BOTTOM));
        //doubleHanger.putOntoCloth(new Cloth(ClothType.SKIRT, ClothPart.BOTTOM));
        doubleHanger.putOntoCloth(new Cloth(ClothType.SHIRT, ClothPart.UPPER));
        doubleHanger.putOntoCloth(new Cloth(ClothType.BLOUSE, ClothPart.UPPER));
        doubleHanger.putOntoCloth(new Cloth(ClothType.SKIRT, ClothPart.BOTTOM));

        wardrobe.hangHanger(singleHanger);
        wardrobe.hangHanger(doubleHanger);
        wardrobe.hangHanger(new DoubleHanger());

        wardrobe.isTherePlaceForHanger();

        wardrobe.isTherePlaceFor(new Cloth(ClothType.SHIRT, ClothPart.UPPER));

        System.out.println("I'm taking this out: " + wardrobe.takeOutCloth(1)); // TODO: figure out why id is something else
        System.out.println("I'm taking ALL out: " + doubleHanger.takeAllClothingOff());
        System.out.println("I'm taking ALL out: " + singleHanger.takeAllClothingOff());

        // nincs constructor
    }
}
