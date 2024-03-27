package com.muyoukule.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.muyoukule.Dao")
@Import({JdbcConfig.class})
public class SpringConfig {
}


