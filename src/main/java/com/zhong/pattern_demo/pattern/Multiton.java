package com.zhong.pattern_demo.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 单例模式可扩展为有限的多例（Multitcm）模式，这种模式可生成有限个实例并保存在 ArmyList 中，客户需要时可随机获取 Multitem
 */
public class Multiton {

    private static final List<Multiton> multitons = new ArrayList<>();

    private int n;

    private Multiton(int n) {
        this.n = n;
    }

    static {
        for (int i = 0; i < 10; i++) {
            multitons.add(new Multiton(i));
        }
    }

    public static Multiton getRandomInstance() {
        int n = (int) Math.random() * 10;
        return multitons.get(n);
    }

}