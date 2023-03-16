package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 10:46
 * @Description:求三个班级的各四名学员的平均成绩
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "个班级");
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("请输入第" + (j + 1) + "个学员的成绩：");
                int grade = input.nextInt();
                sum = sum + grade;
            }
            int avg = sum / 4;
            System.out.println("第" + (i + 1) + "个班级的平均分是：" + avg);
        }
    }
}
