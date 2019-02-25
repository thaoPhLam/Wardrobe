package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

import java.util.ArrayList;
import java.util.List;

public abstract class Hanger {
    protected boolean hasCloth;
    protected int limit;
    protected Cloth cloth;
    protected List<Cloth> cloths = new ArrayList<>();

    /**
     * Hangers can be put into the wardrobe either empty or
     * with some clothes on them.
     */
    public boolean hasCloth() {
        return hasCloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    /**
     * Different kinds of hangers
     * (one that can accomodate shirts or blouses, and
     * ones that can trousers or skirts too)
     * allow pieces of clothing on them to be taken off individually
     * or all of them at once.
     */
    public Cloth takeOneClothingOff(int id) {
        Cloth takeOutCloth = new Cloth();
        for (Cloth cloth : cloths) {
            if (cloth.getId() == id) {
                takeOutCloth = cloth;
            }
        }
        return takeOutCloth;
    }

    public List<Cloth> takeAllClothingOff() {
        return cloths;
    }

    /**
     * Also, they allow pieces of clothing to be put onto them one-by-one.
     */
    public void putOntoCloth(Cloth cloth) {
        cloths.add(cloth);
        hasCloth = true;
        System.out.println(getClass().getSimpleName() + ": I have cloth.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "hasCloth=" + hasCloth +
                ", limit=" + limit +
                ", cloths=" + cloths +
                '}';
    }
}
