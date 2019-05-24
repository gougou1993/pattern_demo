package com.zhong.pattern_demo.pattern.observer;

/**
 * ConcreteSubject1
 */
public class ConcreteSubject extends Subject{

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------"); 
        for (Observer obserser : observers) {
            obserser.response();
        }
    }

    
}