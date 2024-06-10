package com.muyoukule.service;

import com.muyoukule.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Transactional
    public void transfer(String out, String in, Double money) {
        try {
            accountDao.outMoney(out, money);
            int i = 1/0; //这个异常事务会回滚
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }
    }
}

