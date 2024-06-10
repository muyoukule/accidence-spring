package com.muyoukule.bean;


//@Component(属性名 = 属性值, 属性名 = 属性值, 属性名 = 属性值....)
//@Component(value = "userBean")
// 如果属性名是value，value可以省略。

import org.springframework.stereotype.Component;

@Component("userBean")
public class User {

    // 编译器报错，不能出现在这里。
    //@Component(value = "test")
    //private String name;
}
