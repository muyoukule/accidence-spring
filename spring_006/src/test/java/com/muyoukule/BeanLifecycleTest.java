package com.muyoukule;

import com.muyoukule.bean.Student;
import com.muyoukule.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {

    @Test
    public void testLifecycle() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println("8.使用Bean");
        // 只有正常关闭spring容器才会执行销毁方法
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @Test
    public void testBeanRegister() {
        // 自己new的对象
        Student student = new Student();
        System.out.println(student);
        // 创建 默认可列表BeanFactory 对象
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 注册Bean
        factory.registerSingleton("studentBean", student);
        // 从spring容器中获取bean
        Student studentBean = factory.getBean("studentBean", Student.class);
        System.out.println(studentBean);
    }

}
