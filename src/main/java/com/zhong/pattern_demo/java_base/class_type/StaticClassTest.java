package com.zhong.pattern_demo.java_base.class_type;

/**
 * StaticClassTest
 */
public class StaticClassTest {

    private static int a = 10;
    private int b;

    public  static class Inner{
        //private static int a;
        //private int b;
        private int c;
        public void print() {
            System.out.println(a);
            //System.out.println(b); //
        }
    }
    
    public static void main(String[] args) {
        StaticClassTest.Inner inner = new StaticClassTest.Inner();
        inner.print();
    }
}