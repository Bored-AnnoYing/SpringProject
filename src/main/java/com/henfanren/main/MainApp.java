package com.henfanren.main;

import com.henfanren.bean.JavaCollection;
import com.henfanren.bean.TextEditor;
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

        /*HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();*/

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellChecke();

        /*JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollcetion");
        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();*/

    }

}
