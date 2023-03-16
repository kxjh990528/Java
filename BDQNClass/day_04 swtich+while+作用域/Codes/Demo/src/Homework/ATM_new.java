package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 14:05
 * @Description:将之前的模拟atm改成可重复操作
 */
public class ATM_new {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int moeny = 5000;  //总额
        int fun;   //功能
        int deposit;    //存款数额
        int withdraw;   //取款金额
        int balance;    //余额（用作判断超额）

        System.out.print("是否插卡了？(y/n)：");
        String tmp = input.next();
        while (tmp.equals("y")) {
            System.out.println("欢迎使用！");
            System.out.println("ATM机的功能项为1.存款\t2.取款");
            System.out.print("请你选择功能：");
            fun = input.nextInt();

            /*
            //if语句实现
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
             */

            //switch语句实现
            switch (fun) {
                case 1:
                    System.out.println("请输入存款金额:");
                    deposit = input.nextInt();
                    moeny = moeny + deposit;
                    System.out.println("余额为:" + moeny);
                    break;
                case 2:
                    System.out.println("请输入取款金额:");
                    withdraw = input.nextInt();
                    balance = moeny - withdraw;
                    if (balance < 0) {
                        System.out.println("不好意思，卡内余额只有" + moeny + "，余额不足，无法取出！");
                    } else if (balance >= 0) {
                        moeny = moeny - withdraw;
                        System.out.println("余额为：" + moeny);
                    }
                    break;
                default:
                    System.out.println("无该功能！");
                    break;
            }

            System.out.print("是否继续操作？(y/n)：");
            tmp = input.next();
        }
        System.out.println("谢谢您的使用，请确认卡和钱财的安全，再见！");
    }
}
