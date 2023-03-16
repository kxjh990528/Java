import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 18:49
 * @Description:4.模拟实现小型计算器：实现加减乘除
 */
public class MiniCalculator {
    public static void main(String[] args) {
        double a;   //第一个数
        double b;   //第二个数
        String symbol;  //运算符
        double result;  //结果

        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        a = input.nextDouble();
        System.out.print("请输入符号:");
        symbol = input.next();
        System.out.print("请输入第二个数：");
        b = input.nextDouble();
        if (symbol.equals("+")) {
            result = a + b;
            System.out.println("结果为：" + result);
        } else if (symbol.equals("-")) {
            result = a - b;
            System.out.println("结果为：" + result);
        } else if (symbol.equals("*")) {
            result = a * b;
            System.out.println("结果为：" + result);
        } else if (symbol.equals("/")) {
            result = a / b;
            System.out.println("结果为：" + result);
        }
    }
}
