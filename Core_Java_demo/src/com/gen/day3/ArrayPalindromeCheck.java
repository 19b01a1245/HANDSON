package com.gen.day3;

public class ArrayPalindromeCheck {
	public static boolean isPalindrome(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
			}
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 2, 1 };
		int[] arr2 = { 4, 5, 6, 5, 4 };
		
		System.out.println("Array 1 is a palindrome: " + isPalindrome(arr1));
		System.out.println("Array 2 is a palindrome: " + isPalindrome(arr2));

	}

}
