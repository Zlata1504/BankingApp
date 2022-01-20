package com.company;

import java.io.Serializable;
import java.util.Date;

public class Loan implements Serializable {
        private Date dateOfIssue;
        private double sum;
        private double percent=7.2;
        private int creditTerm;
        private double monthlyPayment;

        public Date getDateOfIssue() {
                return dateOfIssue;
        }

        public void setDateOfIssue(Date dateOfIssue) {
                this.dateOfIssue = dateOfIssue;
        }

        public double getSum() {
                return sum;
        }

        public void setSum(double sum) {
                this.sum = sum;
        }

        public double getPercent() {
                return percent;
        }

        public void setPercent(double percent) {
                this.percent = percent;
        }

        public int getCreditTerm() {
                return creditTerm;
        }

        public void setCreditTerm(int creditTerm) {
                this.creditTerm = creditTerm;
        }

        public double getMonthlyPayment() {
                return monthlyPayment;
        }

        public void setMonthlyPayment(double monthlyPayment) {
                this.monthlyPayment = monthlyPayment;
        }
}
