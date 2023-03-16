package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/26 9:34
 * @Java version: 1.8.0_361
 * @Description:2.假设中国人得姓都是单个字，请随机输入一个人得姓名，然后输出姓和名。
 * 请输入姓名:王建兵
 * 姓 ：王   名是:建兵
 */
public class OutputName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = input.next();
        char surname = name.charAt(0);    //姓
        System.out.println("姓：" + surname);
        String given_name = name.substring(1);
        System.out.println("名：" + given_name);
    }
}
