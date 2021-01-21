package com.company.composition;

public class Ceilings {
    private int height;
    private int printedColor;

    public Ceilings(int height, int printedColor) {
        this.height = height;
        this.printedColor = printedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPrintedColor() {
        return printedColor;
    }
}
