package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 15:00
 * @Description:作业二 :使用for循环结构实现：从键盘上接受从周一至周五每天的学习时间（以小时为单位），并计算每日平均学习时间。输出结果如图6.12所示。
 */
public class Average_Study_Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double time;   //每日学习时间(h)
        double sum_time = 0;    //总学习时间
        double avg_time;    //平均学习时长

        for (int i = 1; i <= 5 ; i++){
            System.out.print("请输入周" + i + "的学习时长(h)：");
            time = input.nextDouble();
            sum_time = sum_time + time;
        }
        avg_time = sum_time / 5;
        System.out.println("周平均学习时长为：" + avg_time + "h");
    }
}
