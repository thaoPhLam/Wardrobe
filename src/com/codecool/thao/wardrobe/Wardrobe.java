package com.codecool.thao.wardrobe;

import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothType;
import com.codecool.thao.wardrobe.hanger.DoubleHanger;
import com.codecool.thao.wardrobe.hanger.Hanger;
import com.codecool.thao.wardrobe.hanger.SingleHanger;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    /**
     * The wardrobe can accommodate only a certain number of hangers
     * (the actual limit can vary between different wardrobes).
     */
    private static final int LIMIT = 3;
    private List<Hanger> hangers = new ArrayList<>();
    private boolean hasPlace = true;

    /**
     * When placing a single hanger into the wardrobe
     * make sure that you don’t allow more than physically possible.
     */
    public void hangHanger(Hanger hanger) {
        if (hangers.size() < LIMIT) {

            hangers.add(hanger);
            System.out.println(hanger);
        }
    }

    /**
     * Clothes can be taken out of the wardrobe by their unique identifier.
     */
    public Cloth takeOutCloth(int id) {
        Cloth takeOutCloth = new Cloth();
        for (Hanger hanger : hangers) {
            takeOutCloth = hanger.takeOneClothingOff(id);
        }
        return takeOutCloth;
    }

    /**
     * Users of the wardrobe can test whether there’s still place
     * in there for a particular type of clothing.
     */
    //TODO: add enum ClothPart {UPPER, BOTTOM}
    public void isTherePlaceFor(Cloth cloth) {
        for (Hanger hanger : hangers) {
            if (hanger instanceof SingleHanger) {
                checkPlaceOnSingleHanger(cloth, hanger);
            } else if (hanger instanceof DoubleHanger) {
                checkPlaceOnDoubleHanger(cloth, hanger);
            } else {
                System.out.println("There's none left.");
            }
        }
    }

    private void checkPlaceOnSingleHanger(Cloth cloth, Hanger hanger) {
        if (cloth.getClothType().equals(ClothType.BLOUSE)
                || cloth.getClothType().equals(ClothType.SHIRT)) {
            if (hanger.getUpperCloth() == null) {
                System.out.println(
                        "There is place for "
                                + cloth
                                + " on hanger: "
                                + hanger
                );
            }
        }
    }

    private void checkPlaceOnDoubleHanger(Cloth cloth, Hanger hanger) {
        if (cloth.getClothType().equals(ClothType.BLOUSE)
                || cloth.getClothType().equals(ClothType.SHIRT)) {
            if (hanger.getUpperCloth() == null) {
                System.out.println(
                        "There is place for "
                                + cloth
                                + " on hanger: "
                                + hanger
                );
            }
        } else if (cloth.getClothType().equals(ClothType.JEANS)
                || cloth.getClothType().equals(ClothType.SKIRT)) {
            if (((DoubleHanger) hanger).getBottomCloth() == null) {
                System.out.println(
                        "There is place for "
                                + cloth
                                + " on hanger: "
                                + hanger
                );
            }
        }
    }

    public void isTherePlaceForHanger() {
        if (hangers.size() >= LIMIT) {
            noMoreSpace();
        } else {
            System.out.println("There's still some place.");
        }
    }

    private void noMoreSpace() {
        hasPlace = false;
        System.out.println("There's no more place.");
    }
}
