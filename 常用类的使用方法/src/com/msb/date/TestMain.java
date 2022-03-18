package com.msb.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestMain {
    public static void main(String[] args) {
        Date date = new Date();
        //java.sql.Date 是 java.sql.Date 的子类
        System.out.println("date = " + date);
        System.out.println(date.getTime() );

        //1) String --->java.sql.Date
        java.sql.Date date1 = java.sql.Date.valueOf("2022-9-18");
        //2)java.sql.Date --->java.util.Date
        java.util.Date date2 = date1;
        System.out.println("date2 = " + date2);

        //日期转换
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        try {
            Date date3 = df.parse("2022/12/23 11:45:46");
            System.out.println("date3 = " + date3);

            String dateString = df.format(date3);
            System.out.println("dateString = " + dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Calendar cal1 = new GregorianCalendar();
        System.out.println("cal1 = " + cal1);

        //Calendar常用的方法
        System.out.println(cal1.get(Calendar.YEAR));
        System.out.println(cal1.get(Calendar.MONTH));
        System.out.println(cal1.get(Calendar.DATE));
        System.out.println(cal1.get(Calendar.DAY_OF_WEEK ));
    }
}
