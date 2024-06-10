package com.muyoukule.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Wife {
    private String name;
    private Husband husband;
}