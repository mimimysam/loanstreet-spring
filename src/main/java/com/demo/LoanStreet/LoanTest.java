package com.demo.LoanStreet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class LoanTest {

    @GetMapping
    public void test() {
        LoanController controller = new LoanController();

        // Create new loan
        Loan newLoan = new Loan(1000000.99, 7.5, 5000.00, 100);
        Loan newLoan2 = controller.addLoan(newLoan);
        System.out.println(newLoan2.toString());

        // Get all loans
        List<Loan> loansList = controller.getAllLoans();
        for (Loan loan : loansList) {
            System.out.println(loan.toString());
        }

        // Get single loan
        Loan singleLoan = controller.getById(3);
        System.out.println(singleLoan.toString());

        // Update a loan
        singleLoan.setAmount(750000.24);
        singleLoan.setInterestRate(6.99);
        singleLoan.setMonthlyPayment(3333.33);
        singleLoan.setNumberMonths(707);
        Loan updatedLoan = controller.updateLoan(singleLoan);
        System.out.println(updatedLoan);
    }

}
