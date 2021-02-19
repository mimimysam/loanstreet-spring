package com.demo.LoanStreet;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class LoanController {

    RestTemplate restTemplate = new RestTemplate();

    final String ROOT_URI = "http://127.0.0.1:5000/loan";

    public List<Loan> getAllLoans() {
        LoanList loans = restTemplate.getForObject(ROOT_URI, LoanList.class);
        return loans.getLoans();
    }

    public Loan getById(int id) {
        Loan loan = restTemplate.getForObject(ROOT_URI + "/" + id, Loan.class);
        return loan;
    }

    public Loan addLoan(Loan loan) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Loan> httpEntity = new HttpEntity<>(loan, headers);
        Loan newLoan = restTemplate.postForObject(ROOT_URI, httpEntity, Loan.class);
        return newLoan;
    }

    public Loan updateLoan(Loan loan) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Loan> httpEntity = new HttpEntity<>(loan, headers);
        restTemplate.put(ROOT_URI + "/" + loan.getId(), httpEntity);
        return getById(loan.getId());
    }

}
