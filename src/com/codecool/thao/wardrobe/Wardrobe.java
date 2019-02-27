package com.codecool.thao.wardrobe;

import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.hanger.Hanger;

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
