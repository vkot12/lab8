package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Point pixel1 = new Pixel(
                24,
                45,
                12);

        Point pixel2 = new Point(
                34,
                11);


        Point pixel3 = new Pixel(
                34,
                11);

        Point pixel4 = new Pixel(
                56,
                111);



        Object[] pixel = new Object[] {
                pixel1, pixel2, "Hello world", new Object(), pixel3, pixel4
        };

        for (Object p : pixel) {
            System.out.println(p);
        }

        System.out.println(pixel1.equals(pixel3));



    }
}
