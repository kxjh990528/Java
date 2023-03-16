package Homework.Calculator;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 12:18
 * @Java version: 1.8.0_361
 * @Description:作业三：
 * 计算器类（Calculator）。要求定义一个方法求加减成除的运算结果并返回，接收用户选择的运算和两个数字，根据用户选择的运算计算结果。（走参数）
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
