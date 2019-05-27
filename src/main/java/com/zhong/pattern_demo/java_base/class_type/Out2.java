package com.zhong.pattern_demo.java_base.class_type;

/**
 * 定义在方法中的类，就是局部类。如果一个类只在某个方法中使用，则可以考虑使用局部类。
 * Out2
 */
public class Out2 {

    private static int a;
    private int b;

    public void test(final int c) {
        final int d = 1;
        class Inner{
            public void print(){
                System.out.println(c);
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}