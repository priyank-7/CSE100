package com.company;
import java.util.Scanner;
public class MethodAverage {
    public  static float average(int num1, int num2, int num3){
        float av = (num1 + num2 + num3)/3;
        return av;
    }
    public static void main(String[] args) {
        int n1, n2, n3;
        float avg;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        n1 = scn.nextInt();
        System.out.print("Enter number 2: ");
        n2 = scn.nextInt();
        System.out.print("Enter number 3: ");
        n3 = scn.nextInt();

        avg = average(n1, n2, n3);
        System.out.println("Average = ");
        System.out.println(avg);
    }
}
