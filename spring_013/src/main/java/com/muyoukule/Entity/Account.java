package com.muyoukule.Entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}