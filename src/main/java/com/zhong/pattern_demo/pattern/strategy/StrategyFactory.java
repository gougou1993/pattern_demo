package com.zhong.pattern_demo.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式的扩展
 * 在一个使用策略模式的系统中，当存在的策略很多时，客户端管理所有策略算法将变得很复杂，
 * 如果在环境类中使用策略工厂模式来管理这些策略类将大大减少客户端的工作复杂度
 * StrategyFactory
 */
public class StrategyFactory {

    private Map<String, Strategy> strategys = new HashMap<>();

    public void put(String key, Strategy sy) {
        strategys.put(key, sy);
    }

    public Strategy get(String key, Strategy sy) {
        return strategys.get(key);
    }

    public void strategyMethod(String key) {
        strategys.get(key).strategyMethod();
    }
}