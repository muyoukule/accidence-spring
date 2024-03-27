package com.muyoukule;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, String> env = System.getenv();
        System.out.println(env);
    }
}