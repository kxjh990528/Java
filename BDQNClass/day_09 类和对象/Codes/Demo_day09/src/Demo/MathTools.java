package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 19:55
 * @Java version: 1.8.0_361
 * @Description:数学工具类
 */
public class MathTools {
    public int r;  //属性

    public void calArea(){
        //1.求面积
        double area=3.14 * r * r;
        System.out.println("输出面积是:" + area);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //编程方式:面向过程->面向对象->面向接口
        //理解面向对象编程
        //输入半径求圆的面积:面向过程
        //1.输入半径
        System.out.println("请输入半径:");
        int r = input.nextInt();
        //使用面向对象
        MathTools tools = new MathTools();
        //赋值半径
        tools.r = r;
        //求面积
        tools.calArea();

    }
}
