package com.henfanren.main;

import com.henfanren.bean.HellowWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: SpringProject
 * @ClassName: MainApp
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 11:11
 * @Modified By:
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HellowWorld hellowWorld = (HellowWorld) context.getBean("helloworld");
        hellowWorld.getMessage();
    }

}
