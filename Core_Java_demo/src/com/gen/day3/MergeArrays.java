package com.gen.day3;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];

        System.arraycopy(arr1, 0, mergedArray, 0, len1);
        System.arraycopy(arr2, 0, mergedArray, len1, len2);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };

        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }


	}


