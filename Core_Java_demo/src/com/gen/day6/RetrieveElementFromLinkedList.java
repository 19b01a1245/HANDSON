package com.gen.day6;

import java.util.LinkedList;

public class RetrieveElementFromLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        
        System.out.println("Original LinkedList: " + linkedList);

        
        if (!linkedList.isEmpty()) {
            int lastElement = linkedList.getLast();
            System.out.println("Last Element: " + lastElement);
        } else {
            System.out.println("LinkedList is empty.");
        }

        
        System.out.println("LinkedList after retrieval: " + linkedList);
    }
}
