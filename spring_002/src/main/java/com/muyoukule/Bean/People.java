package com.muyoukule.Bean;

import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Setter
@ToString
public class People {
    // 一个人有多个名字
    private List<String> names;

    // 一个人有多个电话
    private Set<String> phones;

    // 一个人有多个住址
    private Map<Integer, String> addrs;

    private Properties properties;
}