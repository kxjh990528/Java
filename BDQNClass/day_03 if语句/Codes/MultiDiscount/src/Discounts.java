import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 18:37
 * @Description:3.模拟实现商超打折程序
 */
public class Discounts {
    public static void main(String[] args) {
        int price;  //购物金额
        double pay;    //实际支付金额

        System.out.print("请输入购物金额：");
        Scanner input = new Scanner(System.in);
        price = input.nextInt();
        if (price < 0){
            System.out.println("金额不正确，请重新输入！");
        }else if (price >= 0 && price < 500){
            pay = price * 0.98;
            System.out.println("实际支付为：" + pay);
        }else if (price >= 500 && price < 800){
            pay = price * 0.9;
            System.out.println("实际支付为：" + pay);
        }else if (price >= 800 && price < 1000){
            pay = price * 0.8;
            System.out.println("实际支付为：" + pay);
        }else if (price >= 1000){
            pay = price * 0.7;
            System.out.println("实际支付为：" + pay);
        }
    }
}
