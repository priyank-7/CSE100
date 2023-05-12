package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        float num2 = sc.nextInt();
        float sum;
        sum = num1/num2;
        System.out.println("Division of two number is "+ sum);
    }
}
