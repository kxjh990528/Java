package Homework.Students;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 15:01
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student();
        System.out.print("请输入学生的java成绩：");
        student.java = input.nextDouble();
        System.out.print("请输入学生的C语言成绩：");
        student.c = input.nextDouble();
        System.out.print("请输入学生的SQL成绩：");
        student.sql = input.nextDouble();

        StudentBiz studentBiz = new StudentBiz();
        System.out.println("该学生的平均分是：" + studentBiz.getAvg(student));
    }
}
