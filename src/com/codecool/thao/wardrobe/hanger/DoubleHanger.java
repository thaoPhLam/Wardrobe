package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothType;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {
    private Cloth bottomCloth;

    public Cloth getBottomCloth() {
        return bottomCloth;
    }

    //TODO: for takeouts -> set the variable back to null
    @Override
    public Cloth takeOneClothingOff(int id) {
        Cloth takeOutCloth = new Cloth();

        List<Cloth> allCloth = new ArrayList<>();

        allCloth.add(upperCloth);
        allCloth.add(bottomCloth);

        for (Cloth cloth : allCloth) {
            if (cloth != null) {
                if (cloth.getId() == id) {
                    takeOutCloth = cloth;
                }
            }
        }
        return takeOutCloth;
    }

    @Override
    public List<Cloth> takeAllClothingOff() {
        List<Cloth> allClothOnHanger = new ArrayList<>();
        allClothOnHanger.add(upperCloth);
        allClothOnHanger.add(bottomCloth);
        return allClothOnHanger;
    }

    @Override
    public void putOntoCloth(Cloth cloth) {
        if (cloth.getClothType().equals(ClothType.BLOUSE)
                || cloth.getClothType().equals(ClothType.SHIRT)) {
            if (upperCloth == null) {
                this.upperCloth = cloth;
            } else {
                System.out.println(
                        getClass().getSimpleName()
                                + " can not put on "
                                + cloth
                                + " already has a "
                                + this.upperCloth
                );
            }
        } else if (cloth.getClothType().equals(ClothType.JEANS)
                || cloth.getClothType().equals(ClothType.SKIRT)) {
            if (bottomCloth == null) {
                this.bottomCloth = cloth;
            } else {
                System.out.println(
                        getClass().getSimpleName()
                                + " can not put on "
                                + cloth
                                + " already has a "
                                + this.bottomCloth
                );
            }
        }
    }

    @Override
    public String toString() {
        return "DoubleHanger{" +
                "upperCloth=" + upperCloth +
                ", bottomCloth=" + bottomCloth +
                '}';
    }
}
