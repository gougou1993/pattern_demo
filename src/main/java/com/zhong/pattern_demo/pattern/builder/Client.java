package com.zhong.pattern_demo.pattern.builder;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}