package useraccount.services.impl;

import framework.annotations.Component;

import useraccount.services.AccountService;

@Component
public class AccountServiceImpl implements AccountService {

    @Override
    public Long getAccountNumber(String userName) {
        return 12345689L;
    }
}