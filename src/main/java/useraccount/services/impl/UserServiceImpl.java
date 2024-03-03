package useraccount.services.impl;

import framework.annotations.Component;

import useraccount.services.UserService;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        return "username";
    }
}