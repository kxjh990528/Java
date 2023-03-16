package Homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 14:48
 * @Description:作业一:某班级参加有五名学员参加考试，
 * 求出总分，平均分，最高分，最低分，还要将每个学生分数由到高排序。
 */
public class Grade_of_Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] grades =new int[5];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            grades[i] = input.nextInt();
        }
        Arrays.sort(grades);
        System.out.println("序号\t\t成绩");
        for (int i = 0; i < grades.length; i++) {
            System.out.println((i + 1) + "\t\t" +grades[i]);
        }
        //输出最高最低分
        //方法一：
        //排好序了，所以最高分就是数组最后一个元素，最低分就是数组第一个元素
        //System.out.println("最高分：" + grades[4]);
        //System.out.println("最低分：" + grades[0]);

        //方法二：通用办法，假如没有排过序就用此办法
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max){
                max = grades[i];
            }
        }
        System.out.println("最高分：" + max);

        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min){
                min = grades[i];
            }
        }
        System.out.println("最低分：" + min);

        //求平均分和总分
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        int avg = sum / grades.length;
        System.out.println("平均分：" + avg);
        System.out.println("总分：" + sum);
    }
}
