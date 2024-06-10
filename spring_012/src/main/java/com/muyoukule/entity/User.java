package com.muyoukule.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String realName;
    private Integer age;
}