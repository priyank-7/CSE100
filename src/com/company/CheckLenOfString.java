package com.company;

import java.util.Scanner;

public class CheckLenOfString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        s = sc.next();
        int length = s.length();
        System.out.println(length);
    }
}
