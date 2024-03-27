package com.muyoukule;

import com.muyoukule.Config.SpringConfig;
import com.muyoukule.Entity.Account;
import com.muyoukule.Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);

        Account tom = new Account(1, "Tom", 1000.00);
        accountService.save(tom);

        Account ac = accountService.findById(1);
        System.out.println(ac);
    }
}