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

        Hanger singleHanger = new SingleHanger();
        singleHanger.putOntoCloth(blouse);

        Hanger doubleHanger = new DoubleHanger();
        doubleHanger.putOntoCloth(jeans);

        wardrobe.hangHanger(singleHanger);
        wardrobe.hangHanger(doubleHanger);

        wardrobe.isTherePlaceFor();
        wardrobe.takeOutCloth(1);
        wardrobe.printOutHangers();

    }
}
