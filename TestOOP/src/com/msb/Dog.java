package com.msb;

public class Dog extends  Animal {

    private int age = 6;

    public void eatFood(){
        System.out.println("我是狗，我要吃骨头");
    }
    {
        age=7;
    }

    public static  void runFast(){
        System.out.println("我是狗，我要跑的跟狗一样快");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
