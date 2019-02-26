package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

import java.util.List;

public abstract class Hanger {
    protected Cloth upperCloth;

    public Cloth takeOneClothingOff(int id) {
        Cloth takeOutCloth = new Cloth();
        if (upperCloth.getId() == id) {
            takeOutCloth = upperCloth;
        }
        return takeOutCloth;
    }

    public abstract List<Cloth> takeAllClothingOff();

    public abstract void putOntoCloth(Cloth cloth);

    @Override
    public String toString() {
        return "Hanger{" +
                "upperCloth=" + upperCloth +
                '}';
    }
}
