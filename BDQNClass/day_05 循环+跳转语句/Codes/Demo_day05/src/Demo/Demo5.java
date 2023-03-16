package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 11:54
 * @Description: //实现用户登入功能: 用户名:admin  密码是:123
 *  //限制三次机会,当登入失败，显示你还有多少次机会
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 3; i >= 1; i--) {
            System.out.print("请输入用户名:");
            String uname = input.next();
            System.out.print("请输入密  码:");
            String pwd = input.next();
            //判断
            if(uname.equals("admin") && pwd.equals("123")){
                System.out.println("登入成功");
                break;
            }else{
                System.out.println("登入失败，你还有" + (3 - i) + "次机会！");
                if (i == 3){
                    System.out.println("输入次数达到上限，请在24小时之后重新尝试！");
                }
            }
        }

    }

}
