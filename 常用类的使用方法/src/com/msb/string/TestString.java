package com.msb.string;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        
        String s = 'a'+1+"abc";
        System.out.println("s = " + s);
        //通过构造器来创建对象：
        String s1 = new String();
        String s2 = new String("abc");
        String s3 = new String(new char[]{'a','b','c'});

        //【3】常用方法：

        String s4 = "abc";
        System.out.println("字符串的长度为："+s4.length());
        String s5 = new String("abc");
        System.out.println("字符串是否为空："+s5.isEmpty());
        System.out.println("获取字符串的下标对应的字符为："+s5.charAt(1));

        //【4】equals:

        String s6 = new String("abc");
        String s7 = new String("abc");
        System.out.println(s6.equals(s7));
        System.out.println(s6==s7);

        //字符串的截取：
        String s10 = "abcdefhijk";
        System.out.println(s10.substring(3));
        System.out.println(s10.substring(3, 6));//[3,6)
        //字符串的合并/拼接操作：
        System.out.println(s10.concat("pppp"));
        //字符串中的字符的替换：
        String s11 = "abcdeahija";
        System.out.println(s11.replace('a', 'u'));
        //按照指定的字符串进行分裂为数组的形式：
        String s12 = "a-b-c-d-e-f";
        String[] strs = s12.split("-");
        System.out.println(Arrays.toString(strs));
        //转大小写的方法：
        String s13 = "abc";
        System.out.println(s13.toUpperCase());
        System.out.println(s13.toUpperCase().toLowerCase());
        //去除收尾空格：
        String s14 = "    a  b  c    ";
        System.out.println(s14.trim());
        //toString()
        String s15 = "abc";
        System.out.println(s15.toString());
        //转换为String类型：
        System.out.println(String.valueOf(false));

    }
}
