package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 15:37
 * @Description:需求说明：商场对顾客的年龄层次进行调查计算各年龄层次的顾客比例
 */
public class Rate_of_Customers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int customer_age;   //顾客年龄信息
        int upper_30 = 0;   //大于三十岁人数
        int lower_30 = 0;   //小于三十岁人数
        int count = 0;  //有效顾客信息总人数
        double rate_upper;  //大于30岁的比例
        double rate_lower;  //小于30岁的比例

        for (int i = 1; i <= 10; i++){
            System.out.print("请输入第" + i + "位顾客的年龄：");
            customer_age = input.nextInt();
            if (customer_age <= 0){
                System.out.println("第" + i + "号顾客信息输入有误，不录入");
            }else if (customer_age < 30){
                lower_30++;
                count++;
            }else if (customer_age >= 30){
                upper_30++;
                count++;
            }
        }
        rate_lower = lower_30 * 100 / count;
        rate_upper = upper_30 * 100 / count;
        System.out.println("30岁以下的顾客比例是：" + rate_lower + "%");
        System.out.println("30岁以上的顾客比例是：" + rate_upper + "%");
    }
}
