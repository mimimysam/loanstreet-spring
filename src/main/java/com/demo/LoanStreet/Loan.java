package com.demo.LoanStreet;

public class Loan {
    int id;
    double amount;
    double interestRate;
    double monthlyPayment;
    int numberMonths;

    public Loan() {}

    public Loan(double amount, double interestRate, double monthlyPayment, int numberMonths) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.monthlyPayment = monthlyPayment;
        this.numberMonths = numberMonths;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getNumberMonths() {
        return numberMonths;
    }

    public void setNumberMonths(int numberMonths) {
        this.numberMonths = numberMonths;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", interestRate=" + interestRate +
                ", monthlyPayment=" + monthlyPayment +
                ", numberMonths=" + numberMonths +
                '}';
    }
}
