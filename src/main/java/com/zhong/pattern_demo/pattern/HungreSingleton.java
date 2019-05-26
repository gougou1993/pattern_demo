package com.zhong.pattern_demo.pattern;

/**
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 * HungreSingleton
 */
public class HungreSingleton {

    private static final HungreSingleton instance = new HungreSingleton();

    private HungreSingleton() {

    }

    public static HungreSingleton getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        HungreSingleton instance = HungreSingleton.getInstance();
        HungreSingleton instance2 = HungreSingleton.getInstance();
        if(instance == instance2){
            System.out.println("instance == instance2");
        }else{
            System.out.println("instance != instance2");
        }
    }
}