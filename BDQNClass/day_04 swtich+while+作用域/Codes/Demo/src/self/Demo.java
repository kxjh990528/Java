package self;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 9:47
 */
public class Demo {
    public static void main(String[] args) {
        //输入名次显示对应的奖
        Scanner input=new Scanner(System.in);
        System.out.println("请输入名次:");
        int temp=input.nextInt();  // 1  2  3 ..

        //多重if
        /*if(temp==1) {
            System.out.println("旅游");
        }
        else if(temp==2) {
            System.out.println("电脑");
        }
        else if(temp==3) {
            System.out.println("硬盘");
        }
        else {
            System.out.println("无");
        }*/

        //switch语句
        switch(temp){
            case 1:
                System.out.println("旅游");
                break;
            case 2:
                System.out.println("电脑");
                break;
            case 3:
                System.out.println("硬盘");
                break;
            default:
                System.out.println("无");
                break;
        }
    }
}
