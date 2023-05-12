package com.company;

import java.util.Scanner;

public class MethodIseven {
    public static boolean iseven(int number){
        if (number%2==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();
        boolean check = iseven(number);
        System.out.println(check);
    }
}
