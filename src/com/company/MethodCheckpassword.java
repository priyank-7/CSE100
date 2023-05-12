package com.company;
import java.util.Scanner;
public class MethodCheckpassword {
    public static boolean checkpassword(String password) {
        if (password.length() >= 8 && password.length() <= 20)
            for (int i = 0; i < 1; i++)
                if (password.charAt(i)>='A' && password.charAt(i)<= 'Z')
                    return true;
        return false;
}
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        password = sc.nextLine();
        boolean validity;
        validity = checkpassword(password);
        System.out.println(validity);
    }
}

