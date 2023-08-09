package com.gen.day6;

import java.util.ArrayList;

public class DecreaseCapacityOfCurrentSize {
    public static void main(String[] args) {
        
        ArrayList<Integer> Num = new ArrayList<>();

        
        Num.add(10);
        Num.add(20);
        Num.add(30);
        Num.add(40);
        Num.add(50);

       
        System.out.println("Original ArrayList: " + Num);

        ArrayList<Integer> newNum  = new ArrayList<>(Num);

        
        System.out.println("New ArrayList with decreased capacity: " + newNum);
    }
}
