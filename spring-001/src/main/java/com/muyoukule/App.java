package com.muyoukule;

import com.muyoukule.Bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //或者在参数后指定返回值的类型
        User userBean = ctx.getBean("userBean", User.class);
        System.out.println(userBean);
        Object dateBean = ctx.getBean("dateBean");
        System.out.println(dateBean);
    }
}