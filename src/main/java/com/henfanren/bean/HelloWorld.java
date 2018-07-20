package com.henfanren.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @ProjectName: SpringProject
 * @ClassName: HellowWorld
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 11:11
 * @Modified By:
 */
public class HelloWorld {

    private String message;
    @Resource(name = "message")
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("World Message1 : " + message);
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

}
