package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/24 16:05
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo3 {
    public static void main(String[] args) {
        //实现登入功能:输入用户名和密码  用户名:admin   密码:123
        //要求:用户名不区分大小写比较
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uname = input.next();    //Admin admin ADMIN
        System.out.println("请输入密码：");
        String pwd = input.next();
        //if(uname.equalsIgnoreCase("admin")&& pwd.equals("123")){
        //if(uname.toLowerCase().equals("admin")&& pwd.equals("123")){
        if(uname.toUpperCase().equals("ADMIN")&& pwd.equals("123")){
            System.out.println("登入成功");
        }else{
            System.out.println("登入失败");
        }
    }
}
