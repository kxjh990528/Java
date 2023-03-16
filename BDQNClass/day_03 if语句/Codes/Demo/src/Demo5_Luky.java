import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 11:50
 * @Description:抽奖规则:会员号的百位数字等于产生的随机数字即为幸运会员
 */
public class Demo5_Luky {
    public static void main(String[] args) {
        int ran;    //接收产生的随机数
        int hundred_place;  //百位上的数字
        int cardID;     //卡号

        Scanner input = new Scanner(System.in);
        System.out.print("请输入四位数卡号：");
        cardID = input.nextInt();
        //获取百位数字
        //hundred_place = cardID % 1000 / 100;
        hundred_place = cardID / 100 % 10;
        //生成随机数
        ran = (int)(Math.random() * 10);
        System.out.println("幸运数字为：" + ran);
        if (hundred_place == ran){
            System.out.println("中奖啦！");
        }else {
            System.out.println("谢谢惠顾！");
        }
    }
}
