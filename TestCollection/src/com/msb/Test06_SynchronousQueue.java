package com.msb;

import org.junit.Test;

import java.util.concurrent.SynchronousQueue;

public class Test06_SynchronousQueue {
    public static void main(String[] args) {
        SynchronousQueue<String> sq = new SynchronousQueue();

        new  Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        System.out.println(sq.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sq.put("q");
                    sq.put("w");
                    sq.put("e");
                    sq.put("u");
                    sq.put("u");
                    sq.put("u");
                    sq.put("u");
                    sq.put("u");
                    sq.put("u");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    @Test
    public void test01(){
        SynchronousQueue<String> sq = new SynchronousQueue();

        new  Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        System.out.println(sq.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sq.put("q");
                    sq.put("w");
                    sq.put("e");
                    sq.put("r");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
