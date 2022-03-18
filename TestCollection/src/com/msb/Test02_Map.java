package com.msb;

import org.junit.Test;

import java.util.*;

public class Test02_Map {
    @Test
    public void testHashSet(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(14);
        hashSet.add(19);
        hashSet.add(80);
        hashSet.add(10);
        System.out.println("hashSet = " + hashSet);

        //创建一个HashSet集合：
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs.add(19));//true
        hs.add(5);
        hs.add(20);
        System.out.println(hs.add(19));//false 这个19没有放入到集合中
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());//唯一，无序
        System.out.println(hs);
            
    }
    @Test
    public void testTreeSet(){
        //创建一个TreeSet:
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(3);
        ts.add(7);
        ts.add(9);
        ts.add(3);
        ts.add(16);
        System.out.println(ts.size());
        System.out.println(ts);

        //创建一个TreeSet:
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("elili");
        ts1.add("blili");
        ts1.add("alili");
        ts1.add("elili");
        ts1.add("clili");
        ts1.add("flili");
        ts1.add("glili");
        System.out.println(ts.size());
        System.out.println(ts);
    }
    @Test
    public void testCollections(){
        //Collections不支持创建对象，因为构造器私有化了
        /*Collections cols = new Collections();*/
        //里面的属性和方法都是被static修饰，我们可以直接用类名.去调用即可：
        //常用方法：
        //addAll：
        ArrayList<String> list = new ArrayList<>();
        list.add("cc");
        list.add("bb");
        list.add("aa");
        list.addAll(1, Arrays.asList(new String[]{"p","o"}));
        System.out.println("list = " + list);
        Collections.addAll(list,"ee","dd","ff");
        Collections.addAll(list,new String[]{"gg","oo","pp"});
        System.out.println(list);
        //binarySearch必须在有序的集合中查找：--》排序：
        Collections.sort(list);//sort提供的是升序排列
        System.out.println(list);
        //binarySearch
        System.out.println(Collections.binarySearch(list, "cc"));
        //copy:替换方法
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"tt","ss");
        Collections.copy(list,list2);//将list2的内容替换到list上去
        System.out.println(list);
        System.out.println(list2);
        //fill 填充
        Collections.fill(list2,"yyy");
        System.out.println(list2);

    }
}
