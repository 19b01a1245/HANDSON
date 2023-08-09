package com.gen.day6;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		ArrayList<Integer> Num = new ArrayList<>();
		
		Num.add(1);
		Num.add(2);
		Num.add(3);
		Num.add(4);
		Num.add(5);
		Num.add(2);
		Num.add(1);
		
		System.out.println("Original ArrayList: " + Num);
		
		HashSet<Integer> hashSet = new HashSet<>(Num);
		
		Num.clear();
		
		Num.addAll(hashSet);
		
		System.out.println(" ArrayList without duplicates: " + Num);

	}

}
