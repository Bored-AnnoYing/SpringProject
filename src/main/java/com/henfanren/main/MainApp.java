package com.henfanren.main;

import com.henfanren.bean.HellowWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        //ApplicationContext context = new FileSystemXmlApplicationContext("F:\\Project\\SpringProject\\src\\main\\resources\\Beans.xml");
        HellowWorld hellowWorld = (HellowWorld) context.getBean("helloworld");
        hellowWorld.getMessage();

        context.registerShutdownHook();

    }

}
