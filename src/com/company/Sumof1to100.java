package com.company;

public class Sumof1to100 {
    public static void main(String[] args) {
        int n = 1, sum = 0;

        do {
            sum = sum +n;
            n = n + 2;
        }while (n<=99);
        System.out.println("Sum of odd number between 1 to 100 is " + sum);
    }
}
