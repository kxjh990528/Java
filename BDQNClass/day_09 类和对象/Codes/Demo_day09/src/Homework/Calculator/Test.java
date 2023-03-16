package Homework.Calculator;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 10:41
 * @Java version: 1.8.0_361
 * @Description:[选做]>>>>>>>> [选做]要求使用面向对象实现[选做]
 * 3.教员要求张浩使用面向对象的思想编写一个计算器类（Calculator）,可以实现两个整数的加，减，乘，除运算。如果你是张浩，准备如何实现？写出你的思路。
 *
 *        效果如下:
 * 请输入第一个数:20
 * 请输入第二个数:20
 * 请输入操作符:+     [有可能为-减 、/除、 *]
 * 计算结果为:40
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choose = "";
        Calculator calculator = new Calculator();
        do {
            System.out.print("请输入第一个数：");
            calculator.first = input.nextDouble();
            System.out.print("请输入第二个数：");
            calculator.second = input.nextDouble();
            System.out.print("请输入操作符：");
            calculator.operator = input.next();
            if (calculator.operation(calculator.first, calculator.second, calculator.operator) == 0){
                System.out.println("输入有误，请重新输入！");
            }else {
                System.out.println("计算结果为：" + calculator.operation(calculator.first, calculator.second, calculator.operator));
            }
            System.out.print("是否继续操作？(y/n)：");
            choose = input.next();
            System.out.println();
        }while (choose.equals("y"));

    }
}
