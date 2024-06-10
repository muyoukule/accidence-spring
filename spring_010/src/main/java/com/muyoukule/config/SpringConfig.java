package com.muyoukule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.muyoukule.service", "com.muyoukule.aspect"})
//@ComponentScan({"com.muyoukule.Service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
