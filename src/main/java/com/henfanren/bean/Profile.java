package com.henfanren.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @ProjectName: SpringProject
 * @ClassName: Profile
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/20 15:53
 * @Modified By:
 */
public class Profile {

    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }
    public void printAge() {
        System.out.println("Age : " + student.getAge() );
    }
    public void printName() {
        System.out.println("Name : " + student.getName() );
    }

}
