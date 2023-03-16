package self;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 10:22
 * @Description:5.使用while循环由用户主导的不确定次数的循环
 */
public class Demo4 {
    public static void main(String[] args) {
        //使用while循环实现由用户主导的不确定次数的循环
        Scanner input=new Scanner(System.in);
        System.out.println("今天能跑吗");
        String flag=input.next();  //y|n
        while(flag.equals("y")){ //真
            System.out.println("跑完一圈.......");
            //询问
            System.out.println("你还能继续跑吗?");
            flag=input.next();  //y|n
        }
    }
}
