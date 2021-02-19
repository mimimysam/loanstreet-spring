package com.demo.LoanStreet;

import java.util.List;

public class LoanList {
    List<Loan> loans;

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "LoanList{" +
                "loans=" + loans +
                '}';
    }
}
