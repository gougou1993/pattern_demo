package com.zhong.pattern_demo.pattern.event;

import java.util.EventListener;

/**
 * //抽象观察者类：铃声事件监听器
 * BellEventListener
 */
public interface  BellEventListener extends EventListener {

    //事件处理方法，听到铃声
    public void heardBell(RingEvent e);
    
}