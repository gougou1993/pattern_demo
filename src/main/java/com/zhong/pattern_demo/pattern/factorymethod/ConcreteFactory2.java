package com.zhong.pattern_demo.pattern.factorymethod;

/**
 * ConcreteFactory2
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }

    
}