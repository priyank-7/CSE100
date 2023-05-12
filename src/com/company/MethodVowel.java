package com.company;
import java.util.Scanner;
public class MethodVowel {
    public static int vowel(String _str_){
        int counter = 0, i, len;
        for (i = 0; i < _str_.length(); i++)
            if (_str_.charAt(i)=='a' || _str_.charAt(i)=='e' || _str_.charAt(i)=='i' || _str_.charAt(i)=='o' || _str_.charAt(i)=='u' )
                counter++;
        return counter;
    }
    public static void main(String[] args) {
        String str;
        int count;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter line: ");
        str = s.nextLine();
        str = str.toLowerCase();
        count = vowel(str);
        System.out.println(count);
    }
}
