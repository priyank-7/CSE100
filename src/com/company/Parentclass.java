package com.company;

public class Parentclass {
        Parentclass(){
            System.out.println("You are in constructor of Parentclass");
        }
        public void display(){
            System.out.println("This is a method of parent class");
        }
}

class JavaExample extends Parentclass{
    JavaExample(){
        System.out.println("You are in construstor of child class");
    }
    public void display(){
        System.out.println("This is method of child class");
        super.display();
    }

    public static void main(String[] args) {
        JavaExample jp = new JavaExample();
        jp.display();

    }
}



