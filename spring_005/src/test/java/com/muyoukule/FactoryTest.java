package com.muyoukule;


import com.muyoukule.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testSimpleFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }

    @Test
    public void testSelfFactoryBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        System.out.println(orderBean);
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
        Person personBean2 = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean2);
    }

    @Test
    public void testDate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-data.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
    }
}

