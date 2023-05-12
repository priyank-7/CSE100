package com.company;

public class circle {
    double radius = 1.0;

    double getarea() {
        return (radius*radius*3.14);
    }
    void displaycirclredetails(){
        System.out.println(this.radius);
        System.out.println(this.getarea());
    }
}
