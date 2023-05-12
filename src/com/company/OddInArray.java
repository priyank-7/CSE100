package com.company;
public class OddInArray {
    public static void main(String[] args) {
        int ary[]={1,4,56,4,78,9,28,1,57,97},count=0;

        for(int i=0;i<ary.length;i++){
            if (ary[i]%2!=0){
                count++;
            }
        }System.out.println("Total count of odd number in array is "+count);
    }
}
