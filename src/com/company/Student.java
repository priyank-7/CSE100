package com.company;

public class Student {
    String Name;
    String Address;
    int Id = 2140129;

    public void PrintStudent(){
        System.out.println(Id);
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Priyank");
        st.setAddress("Ahmedabad University");
        st.PrintStudent();
        System.out.println(st.getName());
        System.out.println(st.getAddress());
    }
}
