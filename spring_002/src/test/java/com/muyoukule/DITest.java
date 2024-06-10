package com.muyoukule;


import com.muyoukule.bean.Math;
import com.muyoukule.bean.*;
import com.muyoukule.service.OrderService;
import com.muyoukule.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DITest {

    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.save();
    }

    @Test
    public void testConstructorDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.delete();
    }

    @Test
    public void testInnerBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-inner-bean.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.save();
    }

    @Test
    public void testSimpleType() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-simple-type.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testSimpleTypeSet() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("date.xml");
        SimpleValueType svt = applicationContext.getBean("svt", SimpleValueType.class);
        System.out.println(svt);
    }

    @Test
    public void testCascade() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-cascade.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testArraySimple() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array-simple.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testArray() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testCollection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }

    @Test
    public void testNull() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-null.xml");
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
    }

    @Test
    public void testSpecial() {
        //这里注意导入 Math 包的时候不要导成 java.lang.Math 了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-special.xml");
        Math mathBean = applicationContext.getBean("mathBean", Math.class);
        System.out.println(mathBean);
    }
}

