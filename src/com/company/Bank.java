package com.company;

import java.util.Scanner;

public class Bank {
    static Scanner scan = new Scanner(System.in);
    public static void start () {
        System.out.println("1.register 2.login");
        int number = scan.nextInt();
    if (number==1){
        System.out.println("Please,enter your data:name,last name,gender,email,date of Birth");
    }
    else if (number==2){

        System.out.println("Please,enter your login and password");
        }

    }
}
