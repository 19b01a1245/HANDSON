package com.gen.day3;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 8, 2, 20, 10, 15 };
        int secondSmallest = findSecondSmallest(arr);

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second Smallest Element: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found.");
        }
    }
}
