package com.gen.day6;

import java.util.LinkedList;

public class AppendLinkedList {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        
        System.out.println("Original LinkedList: " + linkedList);

        
        int AppendedElement = 40;

      
        linkedList.addLast(AppendedElement);

       
        System.out.println("LinkedList after appending " + AppendedElement + ": " + linkedList);
    }


	}


