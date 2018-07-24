package com.henfanren.annotation;

import java.lang.reflect.Field;

/**
 * @ProjectName: SpringProject
 * @ClassName: People
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/24 14:24
 * @Modified By:
 */
public class People {

    String name;

    @FilterToString(true)
    int age;

    @FilterToString
    String sex;

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {

        String toString = "People{" +
                "name='" + name +
                "', age=" + age +
                "', sex='" + sex +
                "'}\n";
        try {
            toString += "People{";
            Class clazz = this.getClass();
            Field[] fields = clazz.getFields();
            Field[] declaredFields = clazz.getDeclaredFields();

            for(Field field : declaredFields) {
                if (field.isAnnotationPresent(FilterToString.class)) {
                    FilterToString annotation = field.getAnnotation(FilterToString.class);
                    if (annotation.value()) {
                        continue;
                    }
                }
                toString += field.getName() + "='";
                toString += field.get(this) + "',";
            }
            toString = toString.substring(0, toString.length()-1);
            toString += "}";
        } catch (IllegalAccessException e) {
            toString += e.getMessage();
            //e.printStackTrace();
        }
        return toString;
    }
}
