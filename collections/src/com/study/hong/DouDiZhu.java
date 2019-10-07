package com.study.hong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouDiZhu {
    public static void main(String[] args) {
        // 1. 准备牌
        // 1.1 定义一个存储54张牌的ArrayList集合,泛型使用String
        List<String> puKer = new ArrayList<>();
        // 1.2 定义两个数组,一个数组存储牌的花色,一个数组存储牌的序号
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "1", "K", "Q", "J", "10", "9",
                "8", "7", "6", "5", "4", "3"};
        // 1.3 先把大王和小王存储到 puKer 中
        puKer.add("大王");
        puKer.add("小王");
        // 1.4 循环嵌套遍历两个数组,组装52张牌
        for (String color : colors) {
            for (String number : numbers) {
                puKer.add(color + number);
            }
        }
        // 2. 洗牌
        Collections.shuffle(puKer);
        //System.out.println(puKer);
        /*
         * 3. 发牌
         */
        // 3.1 定义四个集合,存储玩家的牌和底牌
        List<String> player01 = new ArrayList<>();
        List<String> player02 = new ArrayList<>();
        List<String> player03 = new ArrayList<>();
        List<String> diPai = new ArrayList<>();
        // 3.2 遍历puKer集合，获取每一张牌
        //使用 索引%3 轮流给3个玩家发牌
        // 当索引>=51时把剩余的三张牌给底牌
       /* for (int i = 0; i < puKer.size(); i++) {
            String puke = puKer.get(i);
            if (i >= 51) {
                diPai.add(puke);
            } else if (i % 3 == 0) {
                player01.add(puke);
            } else if (i % 3 == 1) {
                player02.add(puke);
            } else if (i % 3 == 2) {
                player03.add(puke);
            }
        }*/
        // 4. 看牌
        System.out.println("底牌:" + diPai);
        System.out.println("玩家1" + player01);
        System.out.println("玩家2" + player02);
        System.out.println("玩家3" + player03);
    }
}
