package com.company;

import java.util.Scanner;
public class MathodSmallestNumber {
    public static int smallest(int num1, int num2, int num3){
        if (num1<=num2 && num1 <= num3)
            return num1;
        else if (num2<=num1 && num2<=num3)
            return  num2;
        else
            return num3;
    }
    public static void main(String[] args) {
        int num1, num2, num3, answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter number 3: ");
        num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        num3 = sc.nextInt();
        answer = smallest(num1,num2,num3);
        System.out.println(answer);
    }
}
