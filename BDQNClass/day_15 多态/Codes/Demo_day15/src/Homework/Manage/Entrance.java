package Homework.Manage;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/2 14:37
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//程序入口
public class Entrance {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Scanner scanner = new Scanner(System.in);
        manage.mainMenu();
    }
}
