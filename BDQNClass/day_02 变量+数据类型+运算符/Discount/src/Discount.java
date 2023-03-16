import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 11:20
 */
public class Discount {
    public static void main(String[] args) {
        System.out.print("请输入购物金额：");
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        double dis_price = price * 0.8;
        System.out.println("打折后金额为：" + dis_price);
    }
}
