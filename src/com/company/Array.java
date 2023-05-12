package com.company;
public class Array {
    public static void main(String[] args) {
        int [] mylist = {3,6,34,65,3247,2};
        int sum = 0;
        for (int i=0; i < mylist.length; i++)
            sum += mylist[i];
        System.out.println("Sum of array elements is "+sum);
    }
}
