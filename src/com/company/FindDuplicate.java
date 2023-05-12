package com.company;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 3, 5, 6, 7, 7, 8, 10, 12, 12, 9, 12, 15,15};
        int number = 0;
        for (int i = 0; i<my_array.length; i++) {
            for (int j = i+1; j < my_array.length; j++) {
                if (my_array[i] == my_array[j]){
                    number = my_array[j];
                    System.out.println("Duplicate Array Element : "+number);
                }
                break;
            }
        }
    }
}