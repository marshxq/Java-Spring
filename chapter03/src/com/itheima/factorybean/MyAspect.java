package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//切面类
public class MyAspect implements MethodInterceptor {

    public void check_Permissions() {
        System.out.println("模拟检查权限...");
    }
    public void log() {
        System.out.println("模拟记录日志...");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_Permissions();
        //执行目标方法
        Object obj = methodInvocation.proceed();
        log();
        return obj;
    }
}
