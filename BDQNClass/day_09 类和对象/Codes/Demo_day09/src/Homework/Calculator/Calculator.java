package Homework.Calculator;

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
public class Calculator {
    public double first;   //第一个数
    public double second;  //第二个数
    public String operator;    //操作符
    public double operation(double first, double second, String operator) {
        if (operator.equals("+")) {
            return first + second;
        } else if (operator.equals("-")) {
            return first - second;
        } else if (operator.equals("*")) {
            return first * second;
        } else if (operator.equals("/")) {
            return first / second;
        }else {
            return 0;
        }
    }
}
