package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 14:13
 * @Description:以表格形式输出5笔购物金额及总金额
 */
public class Demo2 {
    public static void main(String[] args) {
        //示例：循环输入5笔购物金额，进行显示
        Scanner input = new Scanner(System.in);
        //1.定义数组 用于存购物金额
        double [] moneys = new double[5];
        //2.循环输入内容存入数组
        for (int i = 0; i < moneys.length; i++) {
            System.out.print("请输入第" + (i+1) + "笔购物金额：");
            double money = input.nextDouble();
            moneys[i] = money;
        }
        //显示数组
        double sum = 0;    //累加器
        System.out.println("序号\t\t金额");
        for (int i = 0; i < moneys.length; i++) {
            System.out.println((i + 1) + "\t\t" + moneys[i]);
            sum = sum + moneys[i];
        }
        System.out.println("总金额：\t" + sum);
    }
}
