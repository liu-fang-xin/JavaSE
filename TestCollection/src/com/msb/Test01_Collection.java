package com.msb;

import org.junit.Test;

import java.util.*;

public class Test01_Collection {
    @Test
    public void test01(){
        /*
        Collection接口的常用方法：
        增加：add(E e) addAll(Collection<? extends E> c)
        删除：clear() remove(Object o)
        修改：
        查看：iterator() size()
        判断：contains(Object o)  equals(Object o) isEmpty()
         */
        //创建对象：接口不能创建对象，利用实现类创建对象：
        Collection col = new ArrayList();
        //调用方法：
        //集合有一个特点：只能存放引用数据类型的数据，不能是基本数据类型
        //基本数据类型自动装箱，对应包装类。int--->Integer
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        System.out.println(col/*.toString()*/);
        List list = Arrays.asList(new Integer[]{11, 15, 3, 7, 1});
        col.addAll(list);//将另一个集合添加入col中
        System.out.println(col);
        //col.clear();清空集合
        System.out.println(col);
        System.out.println("集合中元素的数量为："+col.size());
        System.out.println("集合是否为空："+col.isEmpty());
        boolean isRemove = col.remove(15);
        System.out.println(col);
        System.out.println("集合中数据是否被删除："+isRemove);
        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);
        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);
        col3.add(17);
        System.out.println(col2.equals(col3));
        System.out.println(col2==col3);//地址一定不相等  false
        System.out.println("是否包含元素："+col3.contains(117));

    }

    @Test
    public void testList(){
         /*
        List接口中常用方法：
        增加：add(int index, E element)
        删除：remove(int index)  remove(Object o)
        修改：set(int index, E element)
        查看：get(int index)
        判断：
         */
         /*Collection collection = new ArrayList();
         collection.addAll(Arrays.asList(new Integer[] {1,2,6,7,8}));
        System.out.println(collection.get(1));  Collection没有get（）方法*/
        List list = new ArrayList();

        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);
        list.set(3,77);
        System.out.println(list);
        list.remove(2);//在集合中存入的是Integer类型数据的时候，调用remove方法调用的是：remove(int index)
        System.out.println(list);
        list.remove("abc");
        System.out.println(list);
        Object o = list.get(0);
        System.out.println(o);
        //List集合 遍历：
        //方式1：普通for循环：
        System.out.println("---------------------");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //方式2：增强for循环：
        System.out.println("---------------------");
        for(Object obj:list){
            System.out.println(obj);
        }
        //方式3：迭代器：
        System.out.println("---------------------");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    @Test

    public void testListAdd(){
        //ArrayList add() 添加到超过10个的时候进行扩容
        List list = new ArrayList();
        for (int i = 0; i <11 ; i++) {
            list.add("aaa");
        }
    }
    @Test
    public void testLinkedList(){
         /*
        LinkedList常用方法：
        增加 addFirst(E e) addLast(E e)
             offer(E e) offerFirst(E e) offerLast(E e)
        删除 poll()
            pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
            removeFirst() removeLast()
        修改
        查看 element()
             getFirst()  getLast()
             indexOf(Object o)   lastIndexOf(Object o)
             peek()
             peekFirst() peekLast()
        判断
         */
        //创建一个LinkedList集合对象：
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("bbbbb");
        list.add("fffff");
        list.addFirst("jj");
        list.addLast("hh");
        list.offer("kk");//添加元素在尾端
        list.offerFirst("pp");
        list.offerLast("rr");
        System.out.println(list);//LinkedList可以添加重复数据
        System.out.println(list.poll());//删除头上的元素并且将元素输出
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);//LinkedList可以添加重复数据
        /*list.clear();//清空集合
        System.out.println(list);*/
        /*System.out.println(list.pollFirst());*/
        /*System.out.println(list.removeFirst());报错：Exception in thread "main" java.util.NoSuchElementException*/
        //集合的遍历：
        System.out.println("---------------------");
        //普通for循环：
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        //增强for：
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("---------------------");
        //迭代器：
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //下面这种方式好，节省内存
        for(Iterator<String> it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }

}
