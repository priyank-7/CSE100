package com.company;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1>num2 && num1>num3)
            System.out.println("Number 1 is Greatest number");
        else if (num2>num1 && num2>num3)
            System.out.println("Number 2 is greatest number");
        else
            System.out.println("Number3 is greatest number");
    }
}
