package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 15:20
 * @Description:1．由用户主导的不确定次数的循环
 */
public class Demo {
    public static void main(String[] args) {
        //模拟练习作业是否合格.
        Scanner input=new Scanner(System.in);
        System.out.println("作业合格了吗?");
        String answer=input.next();  //n
        //循环判断
        while(!answer.equals("y")){  //不合格
            //循环体
            System.out.println("上午学习，下午编码...");
            //询问:修改循环条件的变量
            System.out.println("合格了吗?");
            answer=input.next();
        }
    }
}
