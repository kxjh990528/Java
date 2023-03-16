package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 10:03
 * @Description:NULL
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price;
        int count = 0;
        int sum = 0;
        do {
            System.out.print("请输入商品价格：");
            price = input.nextInt();
            sum = sum + price;
            count++;
        }while(price != 0);
        System.out.println("商品总价：" + sum);
        System.out.println("商品总数：" + (count-1));
    }
}
