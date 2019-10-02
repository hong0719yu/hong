package com.study.hong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        /*GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(10);
        int name1 = gc1.getName();
        System.out.println("int:" + name1);

        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("可以是字符串");
        String name2 = gc2.getName();
        System.out.println("String:" + name2);

        GenericClass<Boolean> gc3 = new GenericClass<>();
        gc3.setName(true);
        boolean name3 = gc3.getName();
        System.out.println("boolean:" + name3);*/

        /*GenericMethod genericMethod = new GenericMethod();
        genericMethod.method1(10);

        GenericMethod.method2(true);*/

       /* Collection<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        getElements(list1);
        Collection<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        getElements(list2);*/

        // Integer extends Number extends Object，
        // String extends Object
        Collection<Object> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Integer> list4 = new ArrayList<>();

        //getElement1(list1);// Object
        //getElement1(list2);// String
        getElement1(list3);
        getElement1(list4);

        getElement2(list1);
        //getElement2(list2);// String
        getElement2(list3);
        //getElement2(list4);// Integer

    }

    private static void getElement1(Collection<? extends Number> list) {
        // 上限:只能接收 Number类 及其 子类
    }

    private static void getElement2(Collection<? super Number> list) {
        // 下限:只能接收 Number类 及其 父类
    }

    private static void getElements(Collection<?> list) {
        // ? 代表可以接受任何的数据类型
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            // next() 方法取出的元素是 Object 类型的,可以接受任意类型的数据
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
