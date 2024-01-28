package com.olvera.accounts.service.impl;

import com.olvera.accounts.dto.CustomerDto;
import com.olvera.accounts.repository.AccountsRepository;
import com.olvera.accounts.repository.CustomerRepository;
import com.olvera.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;

    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {


    }
}
