package com.codecool.thao.wardrobe.cloth;

public enum ClothType {
    SHIRT (1),
    BLOUSE (1),
    JEANS (2),
    SKIRT (2);

    /**
     * 1 - upper
     * 2 - bottom
     */
    private final int clothValue;

    ClothType(int clothValue) {
        this.clothValue = clothValue;
    }
}
