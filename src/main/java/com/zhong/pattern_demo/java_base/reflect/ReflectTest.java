package com.zhong.pattern_demo.java_base.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ReflectTest
 */
public class ReflectTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class clazz = Son.class;
        Method[]  methods =  clazz.getDeclaredMethods();//自己声明的方法，不包括父类的

        for (Method method : methods) {
            System.out.println(method.toString());
        }

        Field[] fields = clazz.getDeclaredFields();
        Son instance = (Son) clazz.newInstance();
        for (Field field : fields) {
            System.out.println(field.toString());
            field.setAccessible(true);
            field.set(instance, "name");
        }
        // Method[]  method2s =  clazz.getMethods();
        // for (Method method : method2s) {
        //     System.out.println(method.toString());
        // }
    }
}
class Son extends Parent{

    private String sonPrivateStr;

    private void sonPrivateMethod(){
        System.out.println("sonPrivateMethod");
    }

    public String getSonPrivateStr() {
        return sonPrivateStr;
    }

    public void setSonPrivateStr(String sonPrivateStr) {
        this.sonPrivateStr = sonPrivateStr;
    }

    
}
class Parent {
    private String privateStr;
    protected String protectedStr;

    private void privateMethod(){
        System.out.println("parent privateMethod");
    }

    protected void protectedMethod(){
        System.out.println("parent protectedMethod");
    }

    public String getPrivateStr() {
        return privateStr;
    }

    public void setPrivateStr(String privateStr) {
        this.privateStr = privateStr;
    }

    public String getProtectedStr() {
        return protectedStr;
    }

    public void setProtectedStr(String protectedStr) {
        this.protectedStr = protectedStr;
    }

}