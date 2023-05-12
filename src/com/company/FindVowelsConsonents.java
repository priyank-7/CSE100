package com.company;
import java.util.Scanner;

public class FindVowelsConsonents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        int i, count = 0;
        for (i=0; i< str.length(); i++) {
           if (str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
               count++;
           }
        }
        System.out.print("Vowels in given string is ");
        System.out.println(count);

    }
}
