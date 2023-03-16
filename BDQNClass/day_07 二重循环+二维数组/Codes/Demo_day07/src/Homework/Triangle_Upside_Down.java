package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 14:06
 * @Description:作业二:
 * 请输入行数，显示对应行数的倒三角形:
 * 以5行例:每行*号为:9 7 5 3 1
 * 效果如下:
 * 请输入行数:5
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Triangle_Upside_Down {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入行数：");
        int rows = input.nextInt(); //输入行数

        for (int i = 1; i <= rows; i++) { //行
            for (int k = 1; k <= 2 * (rows -  i) + 1; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
