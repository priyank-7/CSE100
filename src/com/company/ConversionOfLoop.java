package com.company;

public class ConversionOfLoop {
    public static void main(String[] args) {
//       long sum = 0;
//       int num = 1;
//
//       while (num<=200){
//           sum =sum + num;
//           num++;
//       }
//        System.out.println(sum);


        long sum = 0;
        int num = 1;
        do {
            sum = sum + num;
            num++;
        }   while (num<=200);
        System.out.println(sum);
    }
}
