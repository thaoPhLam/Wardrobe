package com.codecool.thao.wardrobe.cloth;

public class Cloth {
    /**
     * All clothes must have
     * a unique identifier,
     * a brand name, and
     * each one must have a type,
     * which is different for different kinds of clothing:
     * shirt, or blouse, trousers or skirt, etc.
     */
    private int id;
    private static int COUNT = 1;
    private String brandName = "H&M";
    private ClothType clothType = ClothType.BLOUSE;

    public Cloth() {
        this.id = COUNT++;
    }

    public Cloth(ClothType clothType) {
        this.clothType = clothType;
        this.id = COUNT++;
    }

    public ClothType getClothType() {
        return clothType;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", clothType=" + clothType +
                '}';
    }
}
