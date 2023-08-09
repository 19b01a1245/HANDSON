package com.gen.day3;

public class SubArraypalindromeCheck {
	public static boolean isPalindrome(int[] arr, int start, int end) {
		while (start < end) {
			if (arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
			}
		return true;
	}
	public static void findSubarrayPalindrome(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		
		while (start < end) {
			if (arr[start] != arr[end]) {
				if(isPalindrome(arr, start + 1,end)) {
					System.out.println("The subarray lies between the indexes " + (start + 1) + "and" + end + ".");
					return;
				}
				else if(isPalindrome (arr, start, end - 1)) {
					System.out.println("The subarray lies between the indexes " + start + "and" + (end - 1) + ".");
					return;
				}
				else { 
					System.out.println("No subarray forms a palindrome.");
					return;
				}
			}
			start++;
			end--;
		}
		System.out.println("The entire array forms a palindrome.");
	}
	

	public static void main(String[] args) {
		int[] arr = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		findSubarrayPalindrome(arr);

	}

}
