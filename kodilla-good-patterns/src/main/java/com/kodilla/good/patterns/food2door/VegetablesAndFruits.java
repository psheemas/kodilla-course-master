package com.kodilla.good.patterns.food2door;

public class VegetablesAndFruits {
    private Integer numberOfPieces;
    private String orderedItem;

    public VegetablesAndFruits(Integer numberOfPieces, String orderedItem) {
        this.numberOfPieces = numberOfPieces;
        this.orderedItem = orderedItem;
    }

    @Override
    public String toString() {
        return  "Product = " + orderedItem +
                " | Available pieces = " + numberOfPieces + "\n";
    }
}
