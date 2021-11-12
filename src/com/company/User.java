package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private  String name;
    private  String lastName;
    private boolean gender;
    private String email;
    private Date date;
    private String password;
    private String listOfCredits;
    private  String listOfCards;
    
    /*
        Scanner sc =....
        User u = new User();
        u.setName(sc.next())
        u.setLastName(sc.next())
        
        String dateString = sc.next();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        u.setDate(df.parse(dateString))
        System.out.println(u.getDate());
    */
    
//    User (String name,String lastName,Boolean gender,String email,Date date,String password,String listOfCredits,String listOfCards){
//        this.name=name;
//        this.lastName=lastName;
//        this.gender=gender;
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getListOfCredits() {
        return listOfCredits;
    }

    public void setListOfCredits(String listOfCredits) {
        this.listOfCredits = listOfCredits;
    }

    public String getListOfCards() {
        return listOfCards;
    }

    public void setListOfCards(String listOfCards) {
        this.listOfCards = listOfCards;
    }
}




