package Homework.topic4;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 14:18
 * @Java version: 1.8.0_361
 * @Description:4．[选做]定义一个数组存放着1到100的奇数
 *    定义一个工具类MyMath
 *            属性：int [] arys=new int[50];
 *            利用构造方法:实现数组的初始化
 *            有以下方法实现获取数组从某位置开始到某位置结束【注意:结束位置可不给，默认是到最后】的所有值之和进行返回
 *    编写TestMyMath进行测试
 */
public class TestMyMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arys =new int[50];
        int i = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 1){
                arys[i] = j;
                i++;
            }
        }
        System.out.println("请输入数组起始位置：");
        int start = scanner.nextInt();
        MyMath myMath = new MyMath(arys);
        System.out.println("从第" + start + "个位置起的数组和为：" + myMath.sum(start, arys));
    }
}
