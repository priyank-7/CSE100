package com.company;
        import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int arr[] = {234,457,67,234,68,23,6,8,34,6435};
        int arr2[] = {234,6,34,6435,67,457,234,68,23,8};
        String str[] = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        str[1].compareToIgnoreCase()
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.equals(arr,arr2));
    }
}
