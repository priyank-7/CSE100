package com.company;
public class MaxArrayElementIndex {
    public static void main(String[] args) {
        int [] array = {3,6,3,8,4,8,7,5};
        int max = array[0], i, index = 0 ;
        for (i = 1; i < array.length-1; i++) {
            if (max < array[i]) {
                max = array[i];
                index =  i;
            }
        }System.out.println("Index number of max element is " + index);
        System.out.println("Max array element is "+max);
    }
}
