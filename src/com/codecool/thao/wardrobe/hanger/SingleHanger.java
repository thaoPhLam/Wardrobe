package com.codecool.thao.wardrobe.hanger;

import com.codecool.thao.wardrobe.cloth.Cloth;
import com.codecool.thao.wardrobe.cloth.ClothType;

import java.util.ArrayList;
import java.util.List;

public class SingleHanger extends Hanger {
    @Override
    public Cloth takeOneClothingOff(int id) {
        Cloth takeOutCloth = new Cloth();
        if (this.upperCloth.getId() == id) {
            takeOutCloth = this.upperCloth;
        }
        return takeOutCloth;
    }

    @Override
    public List<Cloth> takeAllClothingOff() {
        List<Cloth> allClothOnHanger = new ArrayList<>();
        allClothOnHanger.add(this.upperCloth);
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
        } else {
            System.out.println(
                    cloth
                    + " is not a TOP"
            );
        }
    }

    @Override
    public String toString() {
        return "SingleHanger{" +
                "upperCloth=" + upperCloth +
                '}';
    }
}
