package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 14:38
 * @Description:使用switch结构实现：为小明制定学习计划，星期一, 星期三, 星期五学习编程，星期二, 星期四, 星期六学习英语，星期日休息。
 */
public class Study_Plans {
    public static void main(String[] args) {
        int weekdays;

        Scanner input =new Scanner(System.in);
        System.out.print("请输入今天星期几(星期日用数字7代替)：");
        weekdays = input.nextInt();

        switch (weekdays){
            case 1:
            case 3:
            case 5:
                System.out.println("学习编程");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("学习英语");
                break;
            case 7:
                System.out.println("休息日");
                break;
        }
    }
}
