package com.muyoukule;


import com.muyoukule.Bean.MyDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    @Test
    public void testProperties() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource dataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void testScope() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
/*    SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
    System.out.println(sb1);
    SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
    System.out.println(sb2);*/
    }
}

