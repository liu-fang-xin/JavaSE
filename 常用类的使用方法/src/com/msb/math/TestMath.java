package com.msb.math;

public class TestMath {
    public static void main(String[] args) {
        //常用属性：
        System.out.println(Math.PI);
        //常用方法：
        System.out.println("随机数："+Math.random());//[0.0,1.0)
        System.out.println("绝对值："+Math.abs(-80));
        System.out.println("向上取值："+Math.ceil(9.1));
        System.out.println("向下取值："+Math.floor(9.9));
        System.out.println("四舍五入："+Math.round(3.5));
        System.out.println("取大的那个值："+Math.max(3, 6));
        System.out.println("取小的那个值："+Math.min(3, 6));
        Integer integer1 = 1270;
        Integer integer2 =1270;
        System.out.println(integer1==integer2);

    }
}
