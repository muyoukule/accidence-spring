package com.muyoukule.Service;

import com.muyoukule.Dao.UserDao;
//public class UserService {
//    // 这里没修改
//    private UserDao aaa;
//
///*    public void setAaa(UserDao aaa) {
//        this.aaa = aaa;
//    }*/
//
//    // set方法名变化了
//    public void setDao(UserDao aaa){
//        this.aaa = aaa;
//    }
//
//    public void save(){
//        System.out.println("UserService...");
//        aaa.insert();
//    }
//}


public class UserService {
    private UserDao aaa;

    // 使用set方式注入，必须提供set方法。
    // 反射机制要调用这个方法给属性赋值的。
    public void setUserDao(UserDao userDao) {
        this.aaa = userDao;
    }

    public void save() {
        System.out.println("UserService...");
        aaa.insert();
    }
}
