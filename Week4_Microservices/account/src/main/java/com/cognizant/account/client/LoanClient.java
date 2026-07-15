package com.cognizant.account.client;

import com.cognizant.account.dto.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "LOAN")
public interface LoanClient {

    @GetMapping("/loans/{number}")
    Loan getLoan(@PathVariable String number);

}