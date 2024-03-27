package com.muyoukule.Service;

import com.muyoukule.Dao.AccountDao;
import com.muyoukule.Dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
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

