package com.company;

public class Inhetitence {
    public String Name = " AP ";
    private int Id = 34;
}

//
class SeasTeacher extends Inhetitence {
    String MainSub = "OOP LAB";
    int Office = 123;

    public static void main(String[] args){
        SeasTeacher st = new SeasTeacher();
        System.out.println(st.Name);
        System.out.println(st.MainSub);
        System.out.println(st.Office);
    }
}

