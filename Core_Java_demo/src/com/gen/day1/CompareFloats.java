package com.gen.day1;
import java.util.Scanner;
public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        float roundnum1 = Math.round(num1 * 1000);
        int roundnum2 = Math.round(num2 * 1000);

        if (num1 == num2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } 
        else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}
