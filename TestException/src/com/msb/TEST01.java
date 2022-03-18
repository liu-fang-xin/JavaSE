package com.msb;

import java.util.Scanner;

public class TEST01 {
    public static void main(String[] args) {

        int number = getNumber();
        System.out.println("number = " + number);
    }
    public static  int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        try {
            System.out.println(num1 / num2);
            return num1+1;
        } catch (Exception e) {
            e.printStackTrace();
            return num2+1;
        } finally {
            num1 = 999 ;
            num2 = 888;
            //12return num1;
        }
    }

}
