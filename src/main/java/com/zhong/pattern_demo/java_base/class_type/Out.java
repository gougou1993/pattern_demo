package com.zhong.pattern_demo.java_base.class_type;

/**
 * Out
 */
public class Out {

    private static int a = 10;

    private int b;

    public class Inner {

        // private static int c = 0; //成员内部类不能定义静态方法和变量（final 修饰的 除外）
        private int c = 0;

        public void print() {
            System.out.println(a);
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Out.Inner inner = new Out().new Inner();
        inner.print();
    }
}