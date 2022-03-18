package com.msb;

public class Test01 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eatFood();
        a.runFast();
        System.out.println("======================");
        Animal a2 = new Animal();
        a2.runFast();
        a2.eatFood();
        System.out.println("======================");
        Dog dog = new Dog();
        dog.eatFood();
        dog.runFast();
        int dogAge = dog.getAge();
        System.out.println("dogAge = " + dogAge);
    }
}
