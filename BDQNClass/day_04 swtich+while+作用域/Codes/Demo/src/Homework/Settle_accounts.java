package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 14:48
 * @Description:作业六:模拟超市结算小程序:请用户循环输入商品的单价，只到用户输入0时结束输入计算总额并统计商品的件数
 */
public class Settle_accounts {
    public static void main(String[] args) {
        int price;  //输入的商品价格
        int sum = 0;    //计算总价
        int count = 0;  //计算件数

        Scanner input = new Scanner(System.in);
        System.out.print("请输入商品的价格：");
        price = input.nextInt();
        while (price != 0){
            sum = sum + price;
            count++;
            System.out.print("请输入商品的价格：");
            price = input.nextInt();
        }
        System.out.println("共购买"+ count + "件商品，实付金额为：" + sum);
    }
}
