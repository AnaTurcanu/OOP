package com.ana.lab2;

    public class Main {

        public static void main(String[] args) {
            Box box1 = new Box();
            box1.volume(box1.height, box1.length, box1.width);
            box1.surfArea(box1.height, box1.length, box1.width);

            Box box2 = new Box(5.8975864);
            box2.volume(box2.height, box2.width, box2.length);
            box2.surfArea(box2.height, box2.width, box2.length);

            Box box3 = new Box(5.8975864, 8.7984, 15.4568);
            box3.volume(box3.height, box3.width, box3.length);
            box3.surfArea(box3.height, box3.width, box3.length);

            Queue q1 = new Queue(300);
            q1.push(5);
            q1.push(8);
            q1.push(56);
            q1.push(549);
            q1.push(855);
            q1.push(57);
            q1.pop();
            q1.pop();
            q1.showEl();


        }
    }