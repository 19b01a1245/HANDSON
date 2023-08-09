package com.gen.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dozens of toys purchased");
        int x = scanner.nextInt();

        
        System.out.println("Enter the price per dozen");
        int y = scanner.nextInt();

       
        System.out.println("Enter the selling price of 1 toy");
        int z = scanner.nextInt();

        
        double costPricePerToy = (double) y / 12;

        double gainPerToy = z - costPricePerToy;

        
        double profitPercentage = (gainPerToy / costPricePerToy) * 100;

        System.out.printf("Profit Percentage: %.2f%%\n", profitPercentage);

        scanner.close();
    }
}