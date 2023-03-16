package Homework;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/26 9:47
 * @Java version: 1.8.0_361
 * @Description:3.录入用户的18位身份证号码，从中提取用户的生日，如图15.22所示。
 */
public class DrawOutBirthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String id = input.next();
        String birthday = id.substring(6, 14);
        String birthday_year = birthday.substring(0, 4);
        String birthday_month = birthday.substring(4, 6);
        String birthday_day = birthday.substring(6, 8);
        System.out.println("用户生日为：\n" + birthday_year + " 年 " + birthday_month + " 月 " + birthday_day + "日");
    }
}
