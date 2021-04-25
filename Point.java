package com.company;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    //геттеры
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

   /* void Point (int x, int y) {
    this.x = x;
    this.y = y;
    } */



    @Override
    public int hashCode() {
            return Objects.hash(x, y);
    }



    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        return true;
    }

    @Override
    public String toString() {
        return "point{" + "x=" + x + ", y=" + y +'}';
    }
}

