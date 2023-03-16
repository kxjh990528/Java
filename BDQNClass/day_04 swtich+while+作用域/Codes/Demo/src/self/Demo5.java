package self;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 9:25
 * @Description:输入月份显示天数
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月有31天");
                break;
            case 2:
                System.out.println("28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
        }
    }
}
