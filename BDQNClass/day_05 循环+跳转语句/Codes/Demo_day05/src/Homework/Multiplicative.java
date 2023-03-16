package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 15:23
 * @Description:作业四:编写java程序，实现接收用户输入的正整数，输出该数的阶乘。例如，输入数据4，则输出4！=1 × 2 × 3 × 4 =24.
 * 要求：限制输入的数据为1~10，否则提示“无效数据”并结束程序。
 */
public class Multiplicative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;  //用户输入的正整数
        int sum = 1;    //阶乘结果

        System.out.print("请输入一个正整数：");
        n = input.nextInt();
        System.out.print(n + "!=");
        if (n >=1 && n <= 10){
            for (int i = n; i >= 1; i--){
                sum = sum * i;
                System.out.print((n - i + 1));
                if (i != 1){
                    System.out.print("x");
                }
            }

            System.out.println("=" + sum);
        }else {
            System.out.println("无效数据");
        }
    }
}
