package com.henfanren.bean;

/**
 * @ProjectName: SpringProject
 * @ClassName: HellowWorld
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 11:11
 * @Modified By:
 */
public class HellowWorld {

    String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        System.out.println("Your Message : " + message);
        return this.message;
    }

}
