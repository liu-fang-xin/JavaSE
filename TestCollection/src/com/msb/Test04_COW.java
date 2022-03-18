package com.msb;

import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test04_COW {
    @Test
    public void test1(){
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        //添加方法：
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);//[1, 2, 3, 4]
        list.add(3);//add方法无论元素是否存在，都可以添加进去--》添加重复的元素
        System.out.println(list);//[1, 2, 3, 4, 3]
        //adj. 缺席的；缺少的；心不在焉的；茫然的
        list.addIfAbsent(3);//添加不存在的元素--》不可以添加重复的数据
        System.out.println(list);//[1, 2, 3, 4, 3, 33]
    }
}
