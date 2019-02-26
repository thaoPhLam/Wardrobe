package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

/**
 * one that can accommodate a single shirt or blouse only
 */
public class SingleHanger extends Hanger {
    public SingleHanger() {
        this.limit = 1;
    }

    @Override
    public void putOntoCloth(Cloth cloth) {
        if (!hasCloth()) {
            cloths.add(cloth);
            System.out.println(
                    getClass().getSimpleName()
                            + " have a "
                            + cloth.getClothType()
            );
            this.hasCloth = true;
            this.cloth = cloth;
        } else {
            System.out.println(
                    getClass().getSimpleName()
                            + " can't put on the "
                            + cloth.getClothType()
                            + " already have a "
                            + this.cloth.getClothType()
            );
        }
    }
}
