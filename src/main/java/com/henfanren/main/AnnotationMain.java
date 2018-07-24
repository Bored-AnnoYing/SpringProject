package com.henfanren.main;

import com.henfanren.annotation.People;

/**
 * @ProjectName: SpringProject
 * @ClassName: AnnotationMain
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/24 14:26
 * @Modified By:
 */
public class AnnotationMain {

    public static void main(String[] args) {
        People people = new People("Faker", 20, "男");

        System.out.println(people.toString());


    }

}
