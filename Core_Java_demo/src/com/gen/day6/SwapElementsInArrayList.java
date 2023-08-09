package com.gen.day6;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInArrayList {

	public static void main(String[] args) {
	
	        ArrayList<Integer> num = new ArrayList<>();

	        
	        num.add(1);
	        num.add(2);
	        num.add(3);

	        
	        System.out.println("Original ArrayList: " + num);

	        int index1 = 4;
	        int index2 = 8;
	        
	        if (index1 >= 0 && index1 < num.size() && index2 >= 0 && index2 < num.size())
	        Collections.swap(num, index1, index2);
	        

	       
	        System.out.println("ArrayList after swapping: " + num);
      }
}


	    

	
