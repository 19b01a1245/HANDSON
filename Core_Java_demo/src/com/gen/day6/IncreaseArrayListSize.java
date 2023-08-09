package com.gen.day6;

import java.util.ArrayList;
import java.util.Collections;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        
        num.add(1);
        num.add(2);
        num.add(3);

        
        System.out.println("Original ArrayList: " + num);

        
        int newSize = 5;
        while (num.size() < newSize) {
            num.add(4); 
        }

        
        System.out.println("ArrayList with increased size: " + num);
    }
}
