package com.company;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter City name:");
        s1 = sc.next();
        System.out.println("Enter City name:");
        s2 = sc.next();
        System.out.println(s1.equals(s2));


    }
}
