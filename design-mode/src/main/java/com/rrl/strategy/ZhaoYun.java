package com.rrl.strategy;

/**
 * Created by lenovo on 2018/7/28.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("111111111111111111");

        context=new Context(new GivenGreenLight());
        context.operate();
        System.out.println("22222222222222222222");

        context= new Context(new BlockEnemy());
        context.operate();
        System.out.println("333333333333333333333333");

    }
}
