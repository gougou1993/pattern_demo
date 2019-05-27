package com.zhong.pattern_demo.java_base.class_type;

/**
 * Test
 */
public class Test {

    public void test(Bird bird) {
        System.out.println(bird.getName() + "能够飞" + bird.fly() + "米");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test(new Bird() { //匿名内部类（要继承一个父类或者实现一个接口、直接使用new 来生成一个对象的引用）

            @Override
            public int fly() {
                return 10000;
            }

            @Override
            public String getName() {
                return "大雁";
            }
        });
    }
}