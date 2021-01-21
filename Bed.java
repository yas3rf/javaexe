package com.company.composition;

public class Bed {
    private int height;
    private int pillow;
    private int sheets;
    private int quilt;
    private String style;

    public Bed(int height, int pillow, int sheets, int quilt, String style) {
        this.height = height;
        this.pillow = pillow;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }

    public void make(){
        System.out.println("Bed is making! ");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPillow() {
        return pillow;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
