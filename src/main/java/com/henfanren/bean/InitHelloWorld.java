package com.henfanren.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ProjectName: SpringProject
 * @ClassName: InitHelloWorld
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 14:45
 * @Modified By:
 */
public class InitHelloWorld implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after : " + beanName);
        return bean;
    }
}
