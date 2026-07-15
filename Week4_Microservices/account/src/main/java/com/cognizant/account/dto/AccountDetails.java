package com.cognizant.account.dto;

import com.cognizant.account.model.Account;

public class AccountDetails {

    private Account account;
    private Loan loan;

    public AccountDetails() {
    }

    public AccountDetails(Account account, Loan loan) {
        this.account = account;
        this.loan = loan;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}