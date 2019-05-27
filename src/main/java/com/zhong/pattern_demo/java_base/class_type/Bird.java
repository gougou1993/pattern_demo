package com.zhong.pattern_demo.java_base.class_type;

/**
 * Bird
 */
public abstract class Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
    
}