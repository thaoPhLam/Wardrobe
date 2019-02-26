package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothType;

import java.util.ArrayList;
import java.util.List;

public class SingleHanger extends Hanger {
    @Override
    public List<Cloth> takeAllClothingOff() {
        List<Cloth> allClothOnHanger = new ArrayList<>();
        allClothOnHanger.add(upperCloth);
        return allClothOnHanger;
    }

    @Override
    public void putOntoCloth(Cloth cloth) {
        if (cloth.getClothType().equals(ClothType.BLOUSE)
                || cloth.getClothType().equals(ClothType.SHIRT)) {
            upperCloth = cloth;
        }
    }
}
