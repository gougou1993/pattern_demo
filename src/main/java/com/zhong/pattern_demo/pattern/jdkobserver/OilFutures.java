package com.zhong.pattern_demo.pattern.jdkobserver;

import java.util.Observable;

/**
 * OilFutures
 */
public class OilFutures  extends Observable{

    private float price;   
    public float getPrice()
    {
        return this.price; 
    }
    public void setPrice(float price)
    {
        super.setChanged() ;  //设置内部标志位，注明数据发生变化 
        super.notifyObservers(price);    //通知观察者价格改变了 
        this.price=price ; 
    }
}