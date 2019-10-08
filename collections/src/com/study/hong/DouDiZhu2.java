package com.study.hong;

import java.util.*;

public class DouDiZhu2 {
    public static void main(String[] args) {
        // 1. 准备牌
        // 1.1 定义一个HashMap集合,存储54张牌的索引和牌
     /*   Map<Integer, String> poKer = new HashMap<>();
        //1.2 定义一个ArrayList集合，存储牌的索引
        List<Integer> poKerIndex = new ArrayList<>();
        //1.3 定义两个集合存储花色和牌得序号
       // List<String> colors = List.of("♥", "♠", "♦", "♣");
       // List<String> numbers = List.of("2", "1", "K", "Q", "J", "10", "9",
       //         "8", "7", "6", "5", "4", "3");
        //1.4 先将大王和小王的牌以及其索引存储到集合中
        int index = 0;
        poKer.put(index, "大王");
        poKerIndex.add(index);
        index++;
        poKer.put(index, "小王");
        poKerIndex.add(index);
        index++;
        //1.4 组装牌
        for (String color : colors) {
            for (String number : numbers) {
                poKer.put(index, color + number);
                poKerIndex.add(index);
                index++;
            }
        }
        //2 洗牌
        Collections.shuffle(poKerIndex);
        //3 发牌
        //3.1 定义玩家和底牌集合
        List<Integer> player01 = new ArrayList<>();
        List<Integer> player02 = new ArrayList<>();
        List<Integer> player03 = new ArrayList<>();
        List<Integer> diPai = new ArrayList<>();
        //3.2 遍历存储牌索引的集合，将索引发给玩家和底牌
        for (int i = 0; i < poKerIndex.size(); i++) {
            Integer in = poKerIndex.get(i);
            if (i >= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }
        //4 排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        //5 看牌
        lookPoKer("周润发", poKer, player01);
        lookPoKer("刘德华", poKer, player02);
        lookPoKer("周星驰", poKer, player03);
        lookPoKer("底牌", poKer, diPai);
    }

    private static void lookPoKer(String name,
                                  Map<Integer, String> poKer,
                                  List<Integer> player) {
        System.out.print(name + ": ");
        for (Integer index : player) {
            String pai = poKer.get(index);
            System.out.print(pai + " ");
        }
        System.out.println();
    }*/
    }
}
