package com.ana.lab1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //ArrayList studList = new ArrayList();
        Students one = new Students();
        one.name = "Margareta";
        one.age = 20;
        one.mark = 10.0f;
        one.university = "UTM";
        //studList.add(stud);

        Students two = new Students();
        two.name = "Ion";
        two.age = 22;
        two.mark = 7.4f;
        two.university = "ASEM";
        //studList.add(stud);

        Students three = new Students();
        three.name = "Maria";
        three.age = 19;
        three.mark = 8.6f;
        three.university = "ASEM";

        Students four = new Students();
        four.name = "Elena";
        four.age = 21;
        four.mark = 9.88f;
        four.university = "UTM";

        Students five = new Students();
        five.name = "Vasile";
        five.age = 22;
        five.mark = 9.99f;
        five.university = "USM";

        Universities utm = new Universities();
        utm.name = "UTM";
        utm.foundationYear = 1964;
        utm.lista = new Students[2];
        utm.lista[0] = one;
        utm.lista[1] = four;

        utm.printUniversity();

        Universities asem = new Universities();
        asem.name = "ASEM";
        asem.foundationYear = 1991;
        asem.lista = new Students[2];
        asem.lista[0] = two;
        asem.lista[1] = three;

        asem.printUniversity();

        Universities usm = new Universities();
        usm.name = "USM";
        usm.foundationYear = 1977;
        usm.lista = new Students[1];
        usm.lista[0] = five;

        usm.printUniversity();

    }
}
