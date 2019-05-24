package com.zhong.pattern_demo.pattern.decorator;

/**
 * //抽象装饰角色
 * Decorator
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}