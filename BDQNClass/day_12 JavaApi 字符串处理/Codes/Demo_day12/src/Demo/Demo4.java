package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/24 16:23
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo4 {
    public static void main(String[] args) {
        /*正确邮箱的格式:superich.wjb@163.com
     必需有@符号且有.符号,且最后一点不能与@相邻
     */
        //示例:输入电子邮箱，判断邮箱格式是否正确
        Scanner input = new Scanner(System.in);
        System.out.println("请输入邮箱:");
        String email = input.next();
        //判断邮箱格式是否正确
        int pos = email.indexOf('@');  //找不到返回-1
        int pos1 = email.lastIndexOf(".");  //找不到返回-1
        System.out.println(email.lastIndexOf("."));
        System.out.println(email.indexOf('@'));
        if(pos != -1 && pos1 != -1 && (pos1 - pos) > 1){
            System.out.println("正确 ");
        }else{
            System.out.println("格式不正确");
        }
    }
}
