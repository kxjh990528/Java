import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 15:44
 * @Description:1.综合练习模拟实现银行取款机实现存款，取款
 */
public class ATM {
    public static void main(String[] args) {
        int moeny = 5000;  //总额
        int fun;   //功能
        int deposit;    //存款数额
        int withdraw;   //取款金额
        int balance;    //余额
        System.out.println("取款机的功能项为1.存款\t2.取款");
        System.out.println("请你选择功能：");
        Scanner input = new Scanner(System.in);
        fun = input.nextInt();
        if (fun == 1){
            System.out.println("请输入存款金额:");
            deposit = input.nextInt();
            balance = moeny + deposit;
            moeny = moeny + deposit;
            System.out.println("余额为:" + balance);
        }else if (fun == 2){
            System.out.println("请输入取款金额:");
            withdraw = input.nextInt();
            balance = moeny - withdraw;
            if (balance < 0){
                System.out.println("不好意思，卡内余额只有" + moeny + "，余额不足，无法取出！");
            }else if (balance >=0){
                moeny = moeny - withdraw;
                System.out.println("余额为：" + moeny);
            }
        }else if (fun != 1 && fun != 2){
            System.out.println("无该功能！");
        }
        System.out.println("谢谢您的使用，请确认卡和钱财的安全，再见！");
    }
}
