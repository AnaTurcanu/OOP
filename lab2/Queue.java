package com.ana.lab2;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    public int maxel;
    private List<Integer> elements = new ArrayList();

    public void push(Integer a){
        if (!isFull()){
            elements.add(0, a);
        }
    }

    public Integer pop(){
        Integer stock = elements.get(elements.size() - 1);
        elements.remove(stock);
        return stock;
    }

    boolean isEmpty(){
        return elements.size() == 0;
    }

    boolean isFull(){
        return elements.size() == maxel;
    }

    public void showEl(){
        for (int i = 0; i < elements.size(); i++){
            System.out.println(elements.get(i));
        }
    }

    Queue(){
    }

    Queue(int me){
        maxel = me;
    }

}