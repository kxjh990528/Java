package Homework.Calculator;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 12:22
 * @Java version: 1.8.0_361
 * @Description:作业三：
 *  * 计算器类（Calculator）。要求定义一个方法求加减成除的运算结果并返回，接收用户选择的运算和两个数字，根据用户选择的运算计算结果。（走参数）
 */
public class Input {
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
