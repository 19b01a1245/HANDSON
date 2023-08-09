package com.gen.day1;

import java.util.Scanner;

public class IntegerEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = input.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = input.nextInt();

        System.out.println("Enter the fourth integer:");
        int num4 = input.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
            
            input.close();
        }
    }
}
