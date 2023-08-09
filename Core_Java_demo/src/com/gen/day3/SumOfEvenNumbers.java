package com.gen.day3;

public class SumOfEvenNumbers {
	public static int sumOfEvenNumbers(int[] arr) {
		int sum = 0;
		for ( int num : arr) {
			if (num % 2 == 0) {
				sum += num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sumOfEven = sumOfEvenNumbers(arr);
		System.out.println("Sum of Even Numbers: " + sumOfEven);
		
	}

}
