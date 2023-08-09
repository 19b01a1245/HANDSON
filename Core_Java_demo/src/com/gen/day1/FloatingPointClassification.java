package com.gen.day1;

import java.util.Scanner;

public class FloatingPointClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        float number = scanner.nextFloat();

        if (number == 0) {
            System.out.println("zero");
        } else {
            if (number > 0) {
                System.out.print("positive ");
            } else {
                System.out.print("negative ");
            }

            float absoluteValue = Math.abs(number);
            if (absoluteValue < 1) {
                System.out.print("small");
            } else if (absoluteValue > 1000000) {
                System.out.print("large");
            }

            System.out.println();
        }

        scanner.close();
       }
}
