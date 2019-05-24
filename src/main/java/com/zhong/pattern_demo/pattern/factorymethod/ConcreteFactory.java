package com.zhong.pattern_demo.pattern.factorymethod;

/**
 * //具体工厂1：实现了厂品的生成方法
 * ConcreteFactory
 */
public class ConcreteFactory implements AbstractFactory {

    @Override
    public Product newProduct() {
        return new ConcreteProduct();
    }

    
}