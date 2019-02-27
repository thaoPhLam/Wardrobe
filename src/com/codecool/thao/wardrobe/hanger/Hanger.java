package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;

import java.util.List;

public abstract class Hanger {
    protected Cloth upperCloth;

    public abstract Cloth takeOneClothingOff(int id);

    public abstract List<Cloth> takeAllClothingOff();

    public abstract void putOntoCloth(Cloth cloth);
}
