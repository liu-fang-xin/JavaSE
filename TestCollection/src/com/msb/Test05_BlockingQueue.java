package com.msb;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test05_BlockingQueue {
    @Test
    public void test01_ArrayBlockingQueue() throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        ArrayBlockingQueue aq = new ArrayBlockingQueue(3);
        //添加元素：
        //【1】添加null元素：不可以添加null元素，会报空指针异常：NullPointerException
        //aq.add(null);
        //aq.offer(null);
        //aq.put(null);
        //【2】正常添加元素：
        aq.add("aaa");
        aq.offer("bbb");
        aq.put("ccc");
        System.out.println(aq);//[aaa, bbb, ccc]
        //【3】在队列满的情况下，再添加元素：
       // aq.add("ddd");//在队列满的情况下，添加元素 出现异常：Queue full
        //System.out.println(aq.offer("ddd"));//没有添加成功，返回false
        //设置最大阻塞时间，如果时间到了，队列还是满的，就不再阻塞了
        aq.offer("ddd",2, TimeUnit.SECONDS);
        //真正阻塞的方法： put ,如果队列满，就永远阻塞
        //aq.put("ddd");
        System.out.println(aq);

    }

    @Test
    public void test02_ArrayBlockingQueue() throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        ArrayBlockingQueue aq = new ArrayBlockingQueue(3);
        aq.add("aaa");
        aq.add("bbb");
        aq.add("ccc");
        //得到头元素但是不移除
        System.out.println(aq.peek());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.poll());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.take());
        System.out.println(aq);
        //清空元素：
        aq.clear();
        System.out.println(aq);
        System.out.println(aq.peek());//null
        System.out.println(aq.poll());//null
        //设置阻塞事件，如果队列为空，返回null，时间到了以后就不阻塞了
        //System.out.println(aq.poll(2, TimeUnit.SECONDS));
        //真正阻塞：队列为空，永远阻塞
        System.out.println(aq.take());
    }

    @Test
    public void test01_LinkedBlockingQueue() throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        LinkedBlockingQueue aq = new LinkedBlockingQueue(3);
        //添加元素：
        //【1】添加null元素：不可以添加null元素，会报空指针异常：NullPointerException
        //aq.add(null);
        //aq.offer(null);
        aq.put(null);
        //【2】正常添加元素：
        aq.add("aaa");
        aq.offer("bbb");
        aq.put("ccc");
        System.out.println(aq);//[aaa, bbb, ccc]
        //【3】在队列满的情况下，再添加元素：
        //aq.add("ddd");//在队列满的情况下，添加元素 出现异常：Queue full
        //System.out.println(aq.offer("ddd"));//没有添加成功，返回false
        //设置最大阻塞时间，如果时间到了，队列还是满的，就不再阻塞了
        //aq.offer("ddd",2, TimeUnit.SECONDS);
        //真正阻塞的方法： put ,如果队列满，就永远阻塞
        aq.put("ddd");
        System.out.println(aq);
    }


    @Test
    public void test02_LinkedBlockingQueue() throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        LinkedBlockingQueue aq = new LinkedBlockingQueue();
        aq.add("aaa");
        aq.add("bbb");
        aq.add("ccc");
        //得到头元素但是不移除
        System.out.println(aq.peek());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.poll());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.take());
        System.out.println(aq);
        //清空元素：
        aq.clear();
        System.out.println(aq);
        System.out.println(aq.peek());//null
        System.out.println(aq.poll());//null
        //设置阻塞事件，如果队列为空，返回null，时间到了以后就不阻塞了
        //System.out.println(aq.poll(2, TimeUnit.SECONDS));
        //真正阻塞：队列为空，永远阻塞
        System.out.println(aq.take());
    }

}
