package com.muyoukule;


import com.muyoukule.Bean.BankDao;
import com.muyoukule.Bean2.Order;
import com.muyoukule.Config.SpringConfig;
import com.muyoukule.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

//    @Test
//    public void testBean() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        User userBean = applicationContext.getBean("userBean", User.class);
//        System.out.println(userBean);
//    }

    @Test
    public void testBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankDao bankDao = applicationContext.getBean("bankDao", BankDao.class);
        System.out.println(bankDao);
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testChoose() {
        new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testValue() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testAutowired() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save();
    }

@Test
public void testNoXml() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = applicationContext.getBean("userService", UserService.class);
    userService.save();
}
}
