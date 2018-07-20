package com.henfanren.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: SpringProject
 * @ClassName: HelloWorldConfig
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/20 16:15
 * @Modified By:
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

}
