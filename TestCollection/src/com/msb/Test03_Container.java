package com.msb;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test03_Container {
    @Test
    public void testStack() {
         /*
        Stack是Vector的子类，Vector里面两个重要的属性：
        Object[] elementData;底层依然是一个数组
        int elementCount;数组中的容量
         */
        Stack s = new Stack();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        System.out.println(s);//[A, B, C, D]
        System.out.println("栈是否为空：" + s.empty());
        System.out.println("查看栈顶的数据，但是不移除：" + s.peek());
        System.out.println(s);
        System.out.println("查看栈顶的数据，并且移除：" + s.pop());
        System.out.println("查看栈顶的数据，并且移除：" + s.pop());
        System.out.println(s);
        s.push("D");//和add方法执行的功能一样，就是返回值不同
        System.out.println(s);
        System.out.println(s.add("1gas "));
        System.out.println(s.push("1ad"));
    }

    @Test
    public void demoThreadSafe() {
        //创建一个ArrayList集合
       // ArrayList list = new ArrayList();
        Collection c=  Collections.synchronizedList(new ArrayList());

        //创建一个线程池，线程池长度为100
        ExecutorService es = Executors.newFixedThreadPool(100);
        //100个线程并发向ArrayList中添加数据
        for ( int i = 0; i < 100000; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                   c.add("ok");
                }
            });
        }
        //关闭线程池：
        es.shutdown();
        //监控线程是否执行完毕：
        while (true) {
            //线程都执行完以后返回true
            if (es.isTerminated()) {
                System.out.println("所有的子线程都执行完毕了！");
                //执行完毕以后看一下集合中元素的数量：
                System.out.println(c.size());
                if (c.size() == 100000) {
                    System.out.println("线程安全！");
                } else {
                    System.out.println("线程不安全！");
                }
                //线程执行完以后，while循环可以停止：
                break;
            }
        }
    }



    public static void main(String[] args) {
        //选择一个容器：
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        //HashMap<String,Integer> map = new HashMap<>();
        Hashtable<String,Integer> hashtable = new Hashtable<>();

        for (int i = 0; i <5 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTime = System.currentTimeMillis();
                    for (int j = 0; j <1000000 ; j++) {
                        map.put("test"+j,j);
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("一共需要的时间为"+(endTime-startTime));
                }
            }).start();
        }

    }
}