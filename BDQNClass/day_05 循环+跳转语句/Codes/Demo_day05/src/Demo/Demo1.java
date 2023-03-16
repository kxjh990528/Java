package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 9:12
 * @Description:NULL
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;  //商品数量
        int price;  //商品价格
        int sum = 0;    //商品总价

        System.out.print("请输入商品价格：");
        price = input.nextInt();
        do {
           sum = sum +price;
           count++;
           System.out.print("请输入商品价格：");
           price = input.nextInt();
        }while (price != 0);
        System.out.println("购买件数：" + count);
        System.out.print("商品总价：" + sum);
    }
}
