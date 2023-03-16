package Homework.StudentManageSystemFullFunction;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/26 11:43
 * @Java version: 1.8.0_361
 * @Description:学生管理系统登录界面
 */
public class Login {
    Scanner scanner = new Scanner(System.in);
    public Administrator []adminlist = new Administrator[5];//定义最大管理员个数为5个
    public int user_num = 0;   //管理员个数

    //static boolean is_registered = false;  //是否注册,true为注册，false为未注册
    public boolean is_login = false;   //是否登录，true为已登入，false为未登入

    //登录界面主菜单
    public void loginMianMenu(){
        String flag;
        do {
            System.out.println("\t\t欢迎使用学生管理系统");
            System.out.println(">>>1.注册 2.登录  3.进入学生管理系统 4.登出 5.退出");
            System.out.print("请输入选择的功能：");
            int controll = scanner.nextInt();
            switch (controll){
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    enterSystem();
                    break;
                case 4:
                    logout();
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("输入有误！");
            }

            System.out.println("你是否想继续操作:(y|n)");
            flag = scanner.next();  //接收输入字符串
        }while (flag.equals("y"));
        System.out.println("系统退出");
    }

    //注册
    public void register() {
        if (user_num > adminlist.length){
            System.out.println("管理员数量已满，添加失败！");
            //return; //退出方法
            this.loginMianMenu();
        }else {
            System.out.println("管理员注册>>>");
            Administrator administrator = new Administrator();
            System.out.println("请输入管理员用户名：");
            administrator.username = scanner.next();
            System.out.println("请输入密码：");
            administrator.password = scanner.nextInt();
            if (user_num < adminlist.length){
                adminlist[user_num] = administrator;
                user_num++;
                System.out.println("注册成功！");
                System.out.println("请牢记用户信息：\n用户名：" + administrator.username + "\t密码：" + administrator.password);
                System.out.println();
                this.loginMianMenu();
            }
        }

    }

    //登录
    public void login(){
        if (user_num == 0){
            System.out.println("还未有管理员注册！请先注册！");
        }else {
            Administrator administrator = new Administrator();
            System.out.println(">>>管理员登录：");
            //登录次数限制器
            for (int i = 1; i <= 3; i++) {
                System.out.print("请输入用户名：");
                administrator.username = scanner.next();
                System.out.println("请输入密码：");
                administrator.password = scanner.nextInt();
                for (int j = 0; j < user_num; j++) {
                    if (administrator.username.equals(adminlist[j].username) && administrator.password == adminlist[j].password){
                        System.out.println("登录成功！");
                        System.out.println("欢迎使用学生管理系统，" + administrator.username + " 老师");
                        is_login = true;
                        this.loginMianMenu();
                        break;
                    }else if (j == user_num - 1){
                        System.out.println("登录失败，用户名或密码输入错误!你还有" + (3 - i) + "次机会！");
                    }
                }
            }
            this.loginMianMenu();
        }
    }

    //进入学生管理系统
    public void  enterSystem(){
        if (user_num == 0 ){
            System.out.println("请先注册！");
            System.out.println();
            this.loginMianMenu();
        }else{
            if (is_login == false){
                System.out.println("请先登录！");
                System.out.println();
                this.loginMianMenu();
            }else if (is_login == true){
                StudentManger studentManger = new StudentManger();
                studentManger.mainMenu();
            }
        }

    }

    //登出
    public void  logout(){
        if (user_num == 0){
            System.out.println("请先注册！");
        }else if (user_num != 0 && is_login == false){
            System.out.println("请先登录！");
        }else if (user_num != 0 && is_login == true){
            System.out.println("[学生管理系统>登出]");
            System.out.println("成功登出！");
            is_login = false;
        }
    }
}
