package com.henfanren.bean;

import org.springframework.beans.factory.annotation.Required;

/**
 * @ProjectName: SpringProject
 * @ClassName: Student
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/20 15:00
 * @Modified By:
 */
public class Student {

    private Integer age;

    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
