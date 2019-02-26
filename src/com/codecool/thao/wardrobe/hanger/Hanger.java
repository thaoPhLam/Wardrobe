package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

import java.util.List;

public abstract class Hanger {
    protected Cloth upperCloth = new Cloth();

    public abstract Cloth takeOneClothingOff(int id);

    public Cloth getUpperCloth() {
        return upperCloth;
    }

    public abstract List<Cloth> takeAllClothingOff();

    public abstract void putOntoCloth(Cloth cloth);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "upperCloth=" + upperCloth +
                '}';
    }
}
