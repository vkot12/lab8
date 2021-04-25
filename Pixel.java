package com.company;

public class Pixel extends Point {
    private int color;

    public Pixel (int x, int y, int color) {
        super (x, y);
        this.color = color;
    }

    public Pixel (Point point, int color) {
        super(point.getX(), point.getY());
        this.color = color;
    }


    public Pixel (int x, int y) {
        super(x, y);
        color =0; //BLACK  = 0
    }

    public int getColor() {return color;}

    @Override
    public String toString()
    {
        String pointString = super.toString();

        return String.format("%s, color %s", pointString, color);
    }


}

