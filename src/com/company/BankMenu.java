package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BankMenu {

    Scanner scan = new Scanner(System.in);
    private static Bank bank = new Bank();

    private void showLogin() {
        System.out.println("Please,enter your login");
        String email=scan.nextLine();
        System.out.println("Please,enter your password");
        String password=scan.nextLine();
        bank.doLogin(email,password);


    }

    private  void showRegister() {
        Scanner scan=new Scanner(System.in);
        User user=new User();
        System.out.println("Please,enter your Name");
        String name=scan.nextLine();
        user.setName(name);

        System.out.println("Please,enter your Last name");
        String lastName=scan.nextLine();
        user.setLastName(lastName);

        try{
        String date=scan.nextLine();
        DateFormat df=new SimpleDateFormat("yyyy.MM.dd");
        Date d=df.parse(date);
        user.setDate(d);}
        catch (ParseException e){
            System.out.println("Date format is incorrect");
        }
        bank.doRegister(user);




    }

    public  void showStartMenu() {
        System.out.println("Select one:1.Login 2.Register 3.Exit");
        int number = scan.nextInt();
        if (number == 1) {
            showLogin();
        } else if (number == 2) {
            showRegister();
        }


    }
    public void showBankMenu(){
        System.out.println("Show my profile info\n" +
                "1.Order new service\n" +
                "2.Show my services info\n" +
                "0. Exit\n");
    }
}
