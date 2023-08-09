package com.gen.day6;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(10);
        Num.add(20);
        Num.add(30);
        Num.add(40);
        Num.add(50);

        
        System.out.println("Original ArrayList: " + Num);

        
        int elementToReplace = 30;
        int newElement = 35;

        
        int index = Num.indexOf(elementToReplace);

       
        if (index != -1) {
            
            Num.set(index, newElement);
            System.out.println("Element " + elementToReplace + " replaced with " + newElement);

           
            System.out.println("ArrayList after replacement: " + Num);
        } else {
            System.out.println("Element not found in the ArrayList.");
        }
    }
}