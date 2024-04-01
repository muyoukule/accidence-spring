package com.muyoukule.Entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String realName;
    private Integer age;
}