package com.gen.day1;

import java.util.Scanner;

public class CubeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer limit: ");
        int limit = scanner.nextInt();

        System.out.println("The cubes of the numbers up to " + limit + " are:");

        for (int i = 1; i <= limit; i++) {
            int cube = i * i * i;
            System.out.println("Number: " + i + ", Cube: " + cube);
        }

        scanner.close();
    }
}