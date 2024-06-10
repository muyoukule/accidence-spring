package com.muyoukule;

import com.muyoukule.config.SpringConfig;
import com.muyoukule.service.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void testAOP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAOPWithAllAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAOPXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        vipService.add();
    }

    @Test
    public void testTransaction() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        // 生成订单
        orderService.generate();
        // 取消订单
        orderService.cancel();
        // 转账
        accountService.transfer();
        // 取款
        accountService.withdraw();
    }

@Test
public void testSecurity() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = applicationContext.getBean("userService", UserService.class);
    ProductService productService = applicationContext.getBean("productService", ProductService.class);
    userService.getUser();
    userService.saveUser();
    userService.deleteUser();
    userService.modifyUser();
    productService.getProduct();
    productService.saveProduct();
    productService.deleteProduct();
    productService.modifyProduct();
}
}
