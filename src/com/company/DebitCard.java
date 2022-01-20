package com.company;

import java.io.Serializable;
import java.util.Date;

public class DebitCard implements Serializable {
    private double balance;
    private String numberOfCard;
    private Date expirationDate;
    private int cvv;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(String numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


    @Override
    public String toString() {
        return "DebitCard{" +
                "current_balance=" + balance +
                ", card_number='" + numberOfCard + '\'' +
                ", expiration_date=" + expirationDate +
                ", CVV=" + cvv +
                '}';
    }

}
