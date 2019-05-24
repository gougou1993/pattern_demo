package com.zhong.pattern_demo.pattern.strategy;

/**
 * ConcreteStrategyA
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }

    
}