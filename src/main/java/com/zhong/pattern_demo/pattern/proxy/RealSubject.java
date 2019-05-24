package com.zhong.pattern_demo.pattern.proxy;

/**
 * 真实主题 RealSubject
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }

}