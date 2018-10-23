package com.ana.lab2;

public class Box {
    double height = 1;
    double length = 1;
    double width = 1;

    Box(){
        System.out.println("1: ");
    }

    Box(double len){
        height = length = width = len;
        System.out.println("2: ");
    }

    Box(double h, double l, double w){
        height = h;
        length = l;
        width = w;
        System.out.println("3: ");
    }


    public void volume(double height, double length, double width){
        double a = height*length*width;
        System.out.println("The volume of the first box is: " + a);
    }

    public void surfArea(double height, double length, double width){
        double s = 2*length*height+2*length*width+2*height*width;
        System.out.println("The surface area of the first box is: " + s);

    }

}