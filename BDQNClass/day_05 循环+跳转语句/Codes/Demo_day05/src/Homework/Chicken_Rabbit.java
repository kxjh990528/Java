package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 16:21
 * @Description:鸡兔同笼是我国古代著名的趣题之一。大约在1500之前，《孙子算经》中记载了这样一道题目：
 * 今有稚兔同笼，上有三十五头，下有九十四足，问鸡兔各几只？试编写程序解决这个问题。利用循环结构实现。
 */
public class Chicken_Rabbit {
    public static void main(String[] args) {

        /*
        //方法一：利用方程关系式推算出结果,但没有循环结构，
        //但不符合题目要求，pass，写着玩一下
        Scanner input = new Scanner(System.in);

        int chickenNum; //鸡的数量
        int rabbitNum;  //兔的数量
        //int heads = input.nextInt();  //头的数量
        //int legs = input.nextInt();   //腿的数量
        int heads = 35; //头的数量
        int legs = 94;  //腿的数量
        //chickenNum + rabbitNum = heads;
        //2 * chickenNum + 4 * rabbitNum = legs;
        chickenNum = 2 * heads - legs / 2;
        rabbitNum = legs / 2 - heads;
        System.out.println("鸡有" + chickenNum + "只，兔有" + rabbitNum +"只。");
         */

        //方法二：穷举
        //Scanner input = new Scanner(System.in);
        int chickenNum; //鸡的数量
        int rabbitNum;  //兔的数量
        //int heads = input.nextInt();  //头的数量
        //int legs = input.nextInt();   //腿的数量
        int heads = 35; //头的数量
        int legs = 94;  //腿的数量
        for (chickenNum = 1; chickenNum <=heads; chickenNum++){
            for (rabbitNum = 1; rabbitNum <= heads; rabbitNum++){
                if (chickenNum + rabbitNum == heads && chickenNum * 2 + rabbitNum * 4 == legs){
                    System.out.println("鸡有" + chickenNum + "只，兔有" + rabbitNum +"只。");
                }
            }
        }
    }
}
