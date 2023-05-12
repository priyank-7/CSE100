package com.company;

import java.util.Scanner;

public class NumIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num = s.nextInt();

        if(num > 0)
            System.out.println("Your number is Positive");
        else
            System.out.println("Your number is Negative");
    }
}
