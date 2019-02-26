package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

/**
 * one that can accommodate a single shirt or blouse only
 */
public class SingleHanger extends Hanger {

    @Override
    public void putOntoCloth(Cloth cloth) {
        if (!hasCloth()) {
            if (cloth.getClothType().getClothValue() == 1) {
                cloths.add(cloth);
                System.out.println(
                        getClass().getSimpleName()
                                + " have a "
                                + cloth.getClothType()
                );
                this.hasCloth = true;
                this.cloth = cloth;
            }
        } else {
            System.out.println(
                    getClass().getSimpleName()
                            + " can't put on the "
                            + cloth.getClothType()
                            + " already have a "
                            + this.cloth.getClothType()
            );
            System.out.println();
        }
    }
}
