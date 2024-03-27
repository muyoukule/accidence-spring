package com.muyoukule.Service;

import com.muyoukule.Dao.AccountDao;

public class AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void save(){
        System.out.println("AccountService...");
        accountDao.insert();
    }
}
