package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BankMenu {

    private final Bank bank;

    public BankMenu(Bank bank) {
        this.bank=bank;
    }

    private void showLogin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please,enter your email");
        String email=scan.nextLine();
        System.out.println("Please,enter your password");
        String password=scan.nextLine();
       if(bank.doLogin(email,password)) {
           showBankMenu();
       }
       else {
           System.out.println("Email or login are incorrect,please try it again");
           showLogin();
       }


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
        System.out.println("Please,indicate your gender ");
        String gender=scan.nextLine();
        user.setGender(gender);

        try{
        System.out.println("Please,enter your birthday:yyyy.MM.dd");
        String date=scan.nextLine();
        DateFormat df=new SimpleDateFormat("yyyy.MM.dd");
        Date d=df.parse(date);
        user.setDate(d);}
        catch (ParseException e){
            System.out.println("Date format is incorrect");
        }

        System.out.println("Enter your email");
        String email=scan.nextLine();
        user.setEmail(email);
        System.out.println("Create a password ");
        String password=scan.nextLine();
        user.setPassword(password);
        System.out.println("you are registered successfully ");

        bank.doRegister(user);
        showBankMenu();
    }

    public  void showStartMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select one:1.Login 2.Register 3.Exit");
        int number = scan.nextInt();
        if (number == 1) {
            showLogin();
        } else if (number == 2) {
            showRegister();
        }


    }
    public void showBankMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Show my profile info\n" +
                "0.My account\n" +
                "1.My balance\n" +
                "2.My Loan Data\n" +
                "3.Order a card\n" +
                "4.Take a loan\n" +
                "5.Exit");
        int number = scan.nextInt();
        if (number == 0) {
            bank.myAccount();
        }
        else if (number == 1) {
            bank.myBalance();
            showBankMenu();
        }
        else if (number==2){
            bank.myLoanData();
            showBankMenu();
        }
        else if(number==3){
            orderCard();
        }
        else if (number==4){
            takeLoan();
        }



    }
    public void orderCard(){
        Random rand=new Random();
        String card="SE";
        for (int i = 0; i < 14; i++)
        {
            int n = rand.nextInt(10) + 0;
            card += Integer.toString(n);
        }
        for (int i = 0; i < 16; i++)
        {
            if(i % 4 == 0)
                System.out.print(" ");
            System.out.print(card.charAt(i));
        }
        DebitCard numberCard=new DebitCard();
        numberCard.setNumberOfCard(card);
        Scanner scan=new Scanner(System.in);
        System.out.println("Come up with a three-digit code");
        int cvv= scan.nextInt();
        numberCard.setCvv(cvv);
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.YEAR, 2);
        Date newDate = instance.getTime();
        numberCard.setExpirationDate(newDate);
        System.out.println("Your current balance is : 0.0 $");
        numberCard.setBalance(0.0);
        bank.orderCard(numberCard);
    }



    public void takeLoan() {
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much would you like to borrow?");
        double sum = scanner.nextDouble();
        Loan loan = new Loan();
        loan.setSum(sum);
        System.out.println("Loan rate 7.2%,if you are satisfied with the interest rate,select the loan term:\"1.12 month\n\"" +
                "                \"2.18 month\n\" " +
                "                \"3.24 month\n\" " +
                "                \"4.36 month\n\" +" +
                "                \"5.Exit\");");
        int number = scanner.nextInt();
        if (number == 1) {
//            amount=((sum*7.2)/100)/12;-проценты ежемесячные
            amount = (sum / 12) + ((sum * 7.2) / 100) / 12;
            System.out.println("Your monthly payment is " + amount);
            loan.setMonthlyPayment(amount);
        } else if (number == 2) {
            amount = (sum / 18) + ((sum * 7.2) / 100) / 12;
            System.out.println("Your monthly payment is " + amount);
            loan.setMonthlyPayment(amount);
        } else if (number == 3) {
            amount = (sum / 24) + ((sum * 7.2) / 100) / 12;
            System.out.println("Your monthly payment is " + amount);
            loan.setMonthlyPayment(amount);
        } else if (number == 4) {
            amount = (sum / 36) + ((sum * 7.2) / 100) / 12;
            System.out.println("Your monthly payment is " + amount);
            loan.setMonthlyPayment(amount);
        }
        bank.takeLoan(loan);

    }
}
