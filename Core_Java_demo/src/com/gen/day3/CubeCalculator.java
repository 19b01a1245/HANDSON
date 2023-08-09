package com.gen.day3;

import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int numTerms = sc.nextInt();

        for (int i = 1; i <= numTerms; i++) {
            int cube = i * i * i;
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + cube);
        }

        sc.close();
    }

}

