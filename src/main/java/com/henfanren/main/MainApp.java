package com.henfanren.main;

import com.henfanren.bean.Student;
import com.henfanren.dao.StudentDAOImpl;
import com.henfanren.util.DataBaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ProjectName: SpringProject
 * @ClassName: MainApp
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 11:11
 * @Modified By:
 */
public class MainApp {

    /*@Autowired
    private static DataBaseUtil dataBaseUtil;*/

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        //ApplicationContext context = new FileSystemXmlApplicationContext("F:\\Project\\SpringProject\\src\\main\\resources\\Beans.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        /*HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();*/

        /*TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellChecke();*/

        /*JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollcetion");
        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();*/

        /*Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );*/

        StudentDAOImpl studentDAO = (StudentDAOImpl) context.getBean("studentDAOImpl");
        System.out.println("------Records Creation--------" );
        studentDAO.create("Zara", 11);
        studentDAO.create("Nuha", 2);
        studentDAO.create("Ayan", 5);

        List<Student> students = studentDAO.listStudents();
        System.out.println("------Listing Multiple Records--------" );
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentDAO.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentDAO.getStudent(1);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());

        //student.printThrowException();

        /*Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();*/

        /*HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();*/

        /*HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();*/

    }

}
