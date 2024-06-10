package com.muyoukule.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}