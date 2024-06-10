package com.muyoukule;


import com.muyoukule.bean.Customer;
import com.muyoukule.bean.MyDataSource1;
import com.muyoukule.bean.MyDataSource2;
import com.muyoukule.bean.MyTime;
import com.muyoukule.service.AccountService;
import com.muyoukule.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void testP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Customer customerBean = applicationContext.getBean("customerBean", Customer.class);
        System.out.println(customerBean);
    }

    @Test
    public void testC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        MyTime myTimeBean = applicationContext.getBean("myTimeBean", MyTime.class);
        System.out.println(myTimeBean);
    }

    @Test
    public void testUtil() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 dataSource1 = applicationContext.getBean("dataSource1", MyDataSource1.class);
        System.out.println(dataSource1);
        MyDataSource2 dataSource2 = applicationContext.getBean("dataSource2", MyDataSource2.class);
        System.out.println(dataSource2);
    }

    @Test
    public void testAutowireByName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save();
    }

    @Test
    public void testAutowireByType() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.save();
    }


}

