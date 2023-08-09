package com.gen.day6;

import java.util.ArrayList;

public class RetrieveElementFromArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

      
        System.out.println("Original ArrayList: " + num);

       
        int indexToRetrieve = 4;

       
        if (indexToRetrieve >= 0 && indexToRetrieve < num.size()) {
            
            int retrievedElement = num.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
