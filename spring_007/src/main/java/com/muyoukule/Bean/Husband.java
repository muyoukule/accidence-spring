package com.muyoukule.Bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Husband {
    private String name;
    private Wife wife;

}