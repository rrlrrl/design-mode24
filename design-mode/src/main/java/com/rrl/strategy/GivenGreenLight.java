package com.rrl.strategy;

/**
 * Created by lenovo on 2018/7/28.
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
