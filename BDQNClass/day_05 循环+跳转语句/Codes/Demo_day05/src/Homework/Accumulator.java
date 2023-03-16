package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 12:15
 * @Description:作业一:使用三种循环分别实现 1-100所有数之和，并熟记三种循环语句
 */
public class Accumulator {
    public static void main(String[] args) {
        //while循环
        int i = 1;
        int sum1 = 0;

        while (i <= 100){
            sum1 = sum1 + i;
            i++;
        }
        System.out.println("while循环1-100之和输出结果：" + sum1);

        //do...while循环
        int j = 1;
        int sum2 = 0;

        do {
            sum2 = sum2 + j;
            j++;
        }while (j <= 100);
        System.out.println("do.while循环1-100之和输出结果：" + sum2);

        //for循环
        int sum3 = 0;
        for (int k = 1; k <= 100; k++){
            sum3 = sum3 + k;
        }
        System.out.println("for循环1-100之和输出结果：" + sum3);
    }
}
