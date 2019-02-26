package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothType;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {
    private Cloth bottomCloth;

    @Override
    public List<Cloth> takeAllClothingOff() {
        List<Cloth> allClothOnHanger = new ArrayList<>();
        allClothOnHanger.add(upperCloth);
        allClothOnHanger.add(bottomCloth);
        return allClothOnHanger;
    }

    @Override
    public void putOntoCloth(Cloth cloth) {
        if (cloth.getClothType().equals(ClothType.BLOUSE)
                || cloth.getClothType().equals(ClothType.SHIRT)) {
            upperCloth = cloth;
        } else if (cloth.getClothType().equals(ClothType.JEANS)
                || cloth.getClothType().equals(ClothType.SKIRT)) {
            bottomCloth = cloth;
        }
    }
}
