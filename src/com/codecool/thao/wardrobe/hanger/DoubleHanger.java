package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

import java.util.ArrayList;
import java.util.List;

/**
 * one that can accommodate a shirt or a blouse and
 * at the same time trousers or a skirt too.
 */
public class DoubleHanger extends Hanger {
    private boolean hasUpper;
    private boolean hasBottom;
    private List<Cloth> upperCloths = new ArrayList<>();
    private List<Cloth> bottomCloths = new ArrayList<>();

    public boolean hasUpper() {
        return hasUpper;
    }

    public boolean hasBottom() {
        return hasBottom;
    }

    @Override
    public void putOntoCloth(Cloth cloth) {
        if (cloth.getClothType().getClothValue() == 1) {
            putOntoUpperCloth(cloth);
        } else if (cloth.getClothType().getClothValue() == 2) {
            putOntoBottomCloth(cloth);
        }
    }

    private void putOntoUpperCloth(Cloth cloth) {
        //if (cloth.getClothType().getClothValue() == 1) {
            if (!hasUpper()) {
                upperCloths.add(cloth);

                cloths.addAll(upperCloths);

                System.out.println(
                        getClass().getSimpleName()
                                + " have a "
                                + cloth.getClothType()
                );

                this.hasCloth = true;
                this.hasUpper = true;
                this.cloth = cloth;

            } else {
                messageForAlreadyHaving(cloth);
            }
        //}
    }

    private void putOntoBottomCloth(Cloth cloth) {
        //if (cloth.getClothType().getClothValue() == 2) {
            if (!hasBottom()) {
                bottomCloths.add(cloth);

                cloths.addAll(bottomCloths);

                System.out.println(
                        getClass().getSimpleName()
                                + " have a "
                                + cloth.getClothType()
                );

                this.hasCloth = true;
                this.hasBottom = true;
                this.cloth = cloth;

            } else {
                messageForAlreadyHaving(cloth);
            }
        //}
    }

    private void messageForAlreadyHaving(Cloth cloth) {
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
