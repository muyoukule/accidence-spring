package com.muyoukule.entity;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}