package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 10:58
 * @Description:循环输入五门课的成绩，求平均分
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int subject = 5;
        double grade;
        double sum = 0;
        for (int i = 1; i <= subject; i++){
            System.out.print("请输入第" + i + "门课的成绩：");
            grade = input.nextDouble();
            sum = sum + grade;
        }
        double avg = sum / subject;
        System.out.println("平均分为：" + avg);
    }
}
