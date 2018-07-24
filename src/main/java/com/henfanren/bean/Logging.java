package com.henfanren.bean;

import org.aspectj.lang.annotation.*;

/**
 * @ProjectName: SpringProject
 * @ClassName: Logging
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/21 12:04
 * @Modified By:
 */
@Aspect
public class Logging {

    @Pointcut("execution(* com.henfanren.bean.*.*(..))")
    public void sellectAll(){

    }

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("sellectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("sellectAll()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(pointcut = "sellectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    @AfterThrowing(pointcut = "sellectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }

}
