package com.zhong.pattern_demo.pattern.observer;

/**
 * ObserverPatternTest
 */
public class ObserverPatternTest {

    public static void main(String[] args) {

        Subject subject=new ConcreteSubject();

        Observer obs1=new ConcreteObserver1();
        Observer obs2=new ConcreteObserver2();

        subject.add(obs1);
        subject.add(obs2);
        
        subject.notifyObserver();
    }
}