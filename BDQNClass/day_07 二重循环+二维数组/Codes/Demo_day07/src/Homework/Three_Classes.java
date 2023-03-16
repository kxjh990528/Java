package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 14:21
 * @Description:作业2：若有3个班级各4名学员参赛，如何计算每个班级参赛学员的平均分?
 */
public class Three_Classes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个班级的成绩");
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("第" + (j + 1) + "个学员的成绩：");
                double grade = input.nextDouble();
                sum = sum + grade;
            }
            double avg = sum / 4;
            System.out.println("第" + (i + 1) + "个班级参赛学员的平均分是：" + avg);
            System.out.println();
        }
    }
}
