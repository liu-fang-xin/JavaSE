package com.msb;

import com.msb.entry.Student;
import org.junit.Test;

import java.util.concurrent.PriorityBlockingQueue;

public class Test07_PriorityBlockingQueue {
    @Test
    public void test01(){
        PriorityBlockingQueue<Student> pq = new PriorityBlockingQueue<>();
        pq.put(new Student("nana",18));
        pq.put(new Student("lulu",11));
        pq.put(new Student("feifei",6));
        pq.put(new Student("mingming",21));
        System.out.println(pq);//发现结果并没有按照优先级顺序排列

    }

    @Test
    public void test02() throws InterruptedException {
        PriorityBlockingQueue<Student> pq = new PriorityBlockingQueue<>();
        pq.put(new Student("nana",18));
        pq.put(new Student("lulu",11));
        pq.put(new Student("feifei",6));
        pq.put(new Student("mingming",21));
        System.out.println("------------------------------------------");
        System.out.println(pq.take());
        System.out.println(pq.take());
        System.out.println(pq.take());
        System.out.println(pq.take());
       /* 从结果证明，这个优先级队列，并不是在put数据的时候计算谁在前谁在后
        而是取数据的时候，才真正判断谁在前 谁在后

        优先级 --》取数据的优先级*/
    }
}
