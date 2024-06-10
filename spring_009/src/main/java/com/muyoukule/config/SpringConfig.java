package com.muyoukule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.muyoukule.dao")
@Import({JdbcConfig.class})
public class SpringConfig {
}


