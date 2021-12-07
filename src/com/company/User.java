package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;

public class User  {
    private String name;
    private String lastName;
    private boolean gender;
    private String email;
    private Date date;
    private String password;
    ArrayList<Loan> listOfCredits = new ArrayList<>();
   ArrayList<DebitCard> listOfCards = new ArrayList<>();





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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Loan> getListOfCredits() {
        return listOfCredits;
    }

    public void setListOfCredits(ArrayList<Loan> listOfCredits) {
        this.listOfCredits = listOfCredits;
    }

    public ArrayList<DebitCard> getListOfCards() {
        return listOfCards;
    }

    public void setListOfCards(ArrayList<DebitCard> listOfCards) {
        this.listOfCards = listOfCards;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", password='" + password + '\'' +
                ", listOfCredits=" + listOfCredits +
                ", listOfCards=" + listOfCards +
                '}';
    }
}





