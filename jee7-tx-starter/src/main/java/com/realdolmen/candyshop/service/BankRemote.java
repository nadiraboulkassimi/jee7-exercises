package com.realdolmen.candyshop.service;

import com.realdolmen.candyshop.domain.Account;
import com.realdolmen.candyshop.domain.Bug;

import javax.ejb.Remote;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by cda5732 on 1/03/2017.
 */
@Remote
public interface BankRemote {
    Account openAccount(Account account);

    Account transfer(BigDecimal amount, Account from, Account to) throws Bug, FileNotFoundException;

    Account transfer(BigDecimal amount, Account to);

    List<Account> findAll();

    void removeAllAccounts();
}
