package com.company;
import java.util.Scanner;
public class MrthodOverloding{
    public static int max(int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }
    public static double max(double a, double b){
        if (a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        int a, b;
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        System.out.println("Bigger number is "+max(a,b));
        System.out.println("Bigger number is "+max(x,y));
    }
}
