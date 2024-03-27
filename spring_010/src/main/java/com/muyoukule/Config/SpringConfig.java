package com.muyoukule.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.muyoukule.Service", "com.muyoukule.Aspect"})
//@ComponentScan({"com.muyoukule.Service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
