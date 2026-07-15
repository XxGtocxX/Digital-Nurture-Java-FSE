package com.cognizant.account.controller;

import com.cognizant.account.client.LoanClient;
import com.cognizant.account.dto.AccountDetails;
import com.cognizant.account.dto.Loan;
import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final LoanClient loanClient;

    public AccountController(LoanClient loanClient) {
        this.loanClient = loanClient;
    }

    @GetMapping("/{number}")
    public AccountDetails getAccount(@PathVariable String number) {

        Account account = new Account(
                number,
                "Savings",
                234343
        );

        Loan loan = loanClient.getLoan(number);

        return new AccountDetails(account, loan);

    }
}