package com.zhong.pattern_demo.pattern.proxy;

/**
 * Proxy
 */
public class Proxy implements Subject {

    private Subject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    private void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }


}