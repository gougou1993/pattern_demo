package com.zhong.pattern_demo.pattern.observer;


/**
 * 具体观察者2
 * ConcreteObserver2
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
    
}