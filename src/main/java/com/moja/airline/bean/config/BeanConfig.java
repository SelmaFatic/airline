package com.moja.airline.bean.config;

import com.moja.airline.bean.ThirdBean;
import com.moja.airline.bean.HelloWorldBean;
import com.moja.airline.bean.SecondBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(name = "vozdraBean")
    @Scope("singleton")
    public HelloWorldBean getHelloWorldBean(SecondBean secondBean){
        return new HelloWorldBean(secondBean);
    }

    @Bean(name = "drugiBean")
    @Scope("prototype")
    public SecondBean secondBean(){
        return new SecondBean();
    }

    @Bean
    public ThirdBean thirdBean(){
        return new ThirdBean();
    }
}
