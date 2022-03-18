package com.msb.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDate {
    public static void main(String[] args) {
        //1.完成实例化：
        //方法1：now()--LocalDate获取当前的日期yyyy-MM-dd
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        //LocalDate获取当前的时间  hh:mm:ss:毫秒
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        
        //LocalDateTime获取当前的日期+时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        
        //方法2 of()--设置指定的 日期  or 时间  or  日期+时间
        LocalDate of = localDate.of(2022,2,24);
        System.out.println("of = " + of);
        LocalTime of2 = localTime.of(14,7,47);
        System.out.println("of2 = " + of2);
        LocalDateTime of3 = LocalDateTime.of(2022,2,24,14,7,47);
        System.out.println("of3 = " + of3);

        //LocalDate,LocalTime用的不如LocalDateTime多
        //下面讲解用LocalDateTime：
        //一些列常用的get***
        System.out.println(localDateTime.getYear());//2022
        System.out.println(localDateTime.getMonth());//FEBRUARY
        System.out.println(localDateTime.getMonthValue());//2
        System.out.println(localDateTime.getDayOfMonth());//24
        System.out.println(localDateTime.getDayOfWeek());//THURSDAY
        System.out.println(localDateTime.getHour());//14
        System.out.println(localDateTime.getMinute());//10
        System.out.println(localDateTime.getSecond());//12


        //不是set方法，叫with
        //体会：不可变性
        LocalDateTime localDateTime1 = localDateTime.withMonth(12);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime1 = " + localDateTime1);

        //提供了加减的操作：
        //加：
        LocalDateTime localDateTime2 = localDateTime.plusMonths(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        //减：
        LocalDateTime localDateTime3 = localDateTime.minusMonths(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);
        
    }
}
