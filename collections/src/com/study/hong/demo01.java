package com.study.hong;

import java.util.*;

public class demo01 {
    public static void main(String[] args) {
      /*  Collection<String> coll = new ArrayList<>();
        coll.add("老婆");
        coll.add("老婆大人");
        coll.add("老婆大大人");
        coll.add("老婆大大大人");*/

       /* Iterator<String> iterator = coll.iterator();
        boolean b1 = iterator.hasNext();
        System.out.println(b1);
        String next = iterator.next();
        System.out.println(next);

        b1 = iterator.hasNext();
        System.out.println(b1);
        next = iterator.next();
        System.out.println(next);

        b1 = iterator.hasNext();
        System.out.println(b1);
        next = iterator.next();
        System.out.println(next);

        b1 = iterator.hasNext();
        System.out.println(b1);
        next = iterator.next();
        System.out.println(next);

        b1 = iterator.hasNext();
        System.out.println(b1);
        next = iterator.next();
        System.out.println(next);*/

      /*  Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("------------------------------------");
        for (Iterator<String> it = coll.iterator(); it.hasNext(); ) {
            String next = it.next();
            System.out.println(next);
        }*/

       /* Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);
        System.out.println(p1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        System.out.println(p2);

        System.out.println(p1 == p2);*/


       /* String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());//96354
        System.out.println(str2.hashCode());//96354

        //这两个字符串特殊，返回的哈希值是一样的
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395*/
        /*Set<Person> set = new HashSet<>();
        Person P1 = new Person("老婆", 18);
        Person P2 = new Person("老婆", 18);
        Person P3 = new Person("老婆", 19);
        System.out.println(P1.hashCode());//32208398
        System.out.println(P2.hashCode());//32208398
        System.out.println(P1 == P2);//false
        System.out.println(P1.equals(P2));//true
        set.add(P1);
        set.add(P2);
        set.add(P3);
        System.out.println(set);*/

      /*  HashSet<String> set = new HashSet<>();
        set.add("老婆");
        set.add("老婆");
        set.add("老婆永远年轻");
        set.add("老婆永远漂亮");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("老婆");
        linked.add("老婆");
        linked.add("老婆永远年轻");
        linked.add("老婆永远漂亮");
        System.out.println(linked);
*/
        /*List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        list1.add("b");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        List<Person> list3 = new ArrayList<>();
        list3.add(new Person("老婆", 18));
        list3.add(new Person("老婆大人", 15));
        list3.add(new Person("美女老婆", 19));
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);*/

        /*List<Student> list = new ArrayList<>();
        list.add(new Student("a", 18));
        list.add(new Student("b", 19));
        list.add(new Student("c", 17));
        list.add(new Student("b", 17));
        System.out.println(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                System.out.println(o1.getAge() + "" + o2.getAge() + "" + result);
                if (result == 0) {
                    result = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                System.out.println(result);
                System.out.println("====================================");
                return result;
            }
        });
        System.out.println(list);
*/
      /*  Map<String, Integer> map = new HashMap<>();
        map.put("老婆", 18);
        Integer age = map.remove("老婆");
        System.out.println(age);
        Integer age2 = map.remove("老公");
        System.out.println(age2);
        //会自动拆箱,但是由于返回值是null,基本类型不能接受 null
        int age3 = map.remove("老公");
        System.out.println(age3);*/

       /* Map<Person, String> map = new HashMap<>();
        map.put(new Person("老婆", 18), "a");
        map.put(new Person("老婆", 19), "a");
        map.put(new Person("老婆", 18), "b");
        Set<Person> set = map.keySet();
        for (Person person : set) {
            String value = map.get(person);
            System.out.println(person + "-->" + value);
        }*/

        /*Set<Map.Entry<Person, String>> entrySet = map.entrySet();
        for (Map.Entry<Person, String> entry : entrySet) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }*/

        List<String> list = List.of("b", "a");
        //list.add("b");//UnsupportedOperationException不支持操作异常
        System.out.println(list);
        //Set<String> set = Set.of("a", "a");//IllegalArgumentException非法参数异常,有重复元素
        Set<String> set = Set.of("a", "b", "c");
        //set.remove("a");//UnsupportedOperationException不支持操作异常
        System.out.println(set);
        //Map<String, Integer> map = Map.of("a", 1, "a", 2);//IllegalArgumentException非法参数异常,有重复元素
        Map<String, Integer> map = Map.of("a", 1, "c", 1, "b", 1);
        //map.put("a", 2);//UnsupportedOperationException不支持操作异常
        System.out.println(map);
    }
}
