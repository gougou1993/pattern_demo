package com.zhong.pattern_demo.pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyTest2
 */
public class ProxyTest2 {

    public static void main(String[] args) {
        Target target = new Target();
        TargetInterface newProxyInstance = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 反射知识点
                        Object invoke = method.invoke(target, args);
                        return invoke;
                    }
                });
        String method1 = newProxyInstance.method1();
        newProxyInstance.method2();
        int method3 = newProxyInstance.method3(100);
        System.out.println(method1);
        System.out.println(method3);
    }
}