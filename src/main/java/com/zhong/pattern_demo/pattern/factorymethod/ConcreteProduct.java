package com.zhong.pattern_demo.pattern.factorymethod;

/**
 * //具体产品1：实现抽象产品中的抽象方法
 * ConcreteProduct
 */
public class ConcreteProduct  implements Product{

    @Override
    public void name() {
        System.out.println("ConcreteProduct1");
    }

    
}