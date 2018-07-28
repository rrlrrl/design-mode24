package com.rrl.strategy;

/**
 * Created by lenovo on 2018/7/28.
 */
public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy=iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }
}
