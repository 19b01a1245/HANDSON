package com.gen.day6;


	import java.util.LinkedList;
	import java.util.ListIterator;

	public class IterateLinkedList {
	    public static void main(String[] args) {
	        
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(10);
	        linkedList.add(20);
	        linkedList.add(30);
	        linkedList.add(40);
	        linkedList.add(50);

	        
	        System.out.println("Original LinkedList: " + linkedList);

	   
	        int startingPosition = 2;

	       
	        ListIterator<Integer> listIterator = linkedList.listIterator(startingPosition);

	        
	        System.out.println("Elements from position " + startingPosition + " onwards:");
	        while (listIterator.hasNext()) {
	            System.out.print(listIterator.next() + " ");
	        }
	    }
	}
