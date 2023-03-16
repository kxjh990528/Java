package self;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 12:08
 * @Description:跑步
 */

public class Demo9 {
    public static void main(String[] args) {
        //模拟跑圈
        Scanner input = new Scanner(System.in);
        System.out.print("你能跑吗？(y/n):");
        String tmp = input.next();
        while (tmp.equals("y")){
            System.out.println("跑了一圈...");
            System.out.print("还能继续吗？(y/n):");
            tmp = input.next();
        }
    }
}
