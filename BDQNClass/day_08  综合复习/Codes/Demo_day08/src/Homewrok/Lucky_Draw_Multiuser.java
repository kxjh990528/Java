package Homewrok;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 15:23
 * @Description:多用户注册
 */
public class Lucky_Draw_Multiuser {
    static String[][] customer = new String[10][3]; //定义最大会员个数为10个
    static int user_num = 0;

    static int max = 9999;
    static int min = 1000;

    static String input_username;

    //static boolean is_registered = false;  //是否注册,true为注册，false为未注册
    static boolean is_login = false;   //是否登录，true为已登入，false为未登入
    int user_Num = 0;   //记录用户数量

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String flag;
        do {
            System.out.println("******欢迎进入奖富翁系统******");
            System.out.println("\t\t1.注册");
            System.out.println("\t\t2.登入");
            System.out.println("\t\t3.抽奖");
            System.out.println("\t\t4.登出");
            System.out.println("****************************");
            System.out.print("请选择菜单:");
            int controll=input.nextInt();
            switch (controll){
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    lucky_Draw();
                    break;
                case 4:
                    logout();
                    break;
                default:
                    System.out.println("输入有误！");
            }

            System.out.println("你是否想继续操作:(y|n)");
            flag=input.next();  //接收输入字符串
        }while (flag.equals("y"));
        System.out.println("系统退出");
    }

    //注册
    public static void register() {
        Scanner input = new Scanner(System.in);
        System.out.println("[奖富抽奖系统>注册]");
        System.out.print("请输入用户名：");
        String username = input.next();
        System.out.print("请输入密码：");
        String password = input.next();
        int cardID = (int)(Math.random()*(max - min)) + min;
        String card = String.valueOf(cardID);//将int型的cardID封装为String型存入数组
        for (int i = 0; i < customer.length; i++) {
            if (username.equals(customer[i][0])) {
                System.out.println("用户名已被使用");
                return;
            }
        }
        if (user_num < 10) {
            customer[user_num][0] = username;
            customer[user_num][1] = password;
            customer[user_num][2] = card;
        } else
            System.out.println("用户数量已满");
        System.out.println("请牢记您的用户信息:");
        System.out.println("用户名："+ username + "\n密 码：" + password + "\n卡 号：" + cardID);
        user_num++;
    }

    //登录
    public static void login(){
        Scanner input = new Scanner(System.in);
        if (user_num == 0){
            System.out.println("请先注册！");
        }else{
            System.out.println("[奖富抽奖系统>登入]");
            //登录次数限制器
            for (int i = 1; i <= 3 ; i++) {
                System.out.print("请输入用户名：");
                input_username = input.next();
                System.out.print("请输入密码：");
                String input_password = input.next();
                for (int j = 0; j < customer.length; j++) {
                    if (input_username.equals(customer[j][0]) && input_password.equals(customer[j][1])) {
                        System.out.println("登陆成功");
                        is_login = true;
                        break;
                    }else if(j == customer.length - 1){
                        System.out.println("输入错误，你还有" + (3 - i) + "次机会！");
                    }
                }
            }
        }
            if (!is_login) {
                System.out.println("用户名或密码错误");
            }
    }


    //幸运抽奖
    public static void lucky_Draw() {
        Scanner input = new Scanner(System.in);
        int pos;
        String present_cardID = "";
        if (user_num == 0){
            System.out.println("请先注册！");
        }else if (user_num != 0 && is_login == false){
            System.out.println("请先登录！");
        }else if (user_num != 0 && is_login == true){
            System.out.println("[奖富抽奖系统>抽奖]");

            //获得当前用户的卡号
            for (int i = 0; i < 10; i++) {
                if (customer[i][0].equals(input_username)){
                    pos = i;
                    System.out.println("您的会员卡号是:" + customer[pos][2]);
                    present_cardID = customer[pos][2];
                    break;
                }
            }
            //int inputCard=input.nextInt();
            //系统产生5个四位随机卡号
            String cards[]=new String [5];
            for(int i = 0; i < cards.length; i++){
                int randCard = (int)(Math.random() * (max - min)) + min;
                //装入数组
                cards[i] = String.valueOf(randCard);
            }
            //输出产生的随机卡号
            System.out.println("随机卡号:");
            for (int i = 0;i < cards.length;i++){
                System.out.print(cards[i]+"\t");
            }
            System.out.println(""); //换行

            //判断卡号在数组中是否有出现
            boolean fg = false;  //表示不存在
            for (int i = 0; i < cards.length; i++){
                if(cards[i].equals(present_cardID)){
                    fg = true;  //存在
                    break;
                }
            }
            if(fg){
                System.out.println("恭喜中奖！");
            }else{
                System.out.println("谢谢惠顾");
            }
        }
    }

    //登出
    public static void logout() {
        if (user_num == 0){
            System.out.println("请先注册！");
        }else if (user_num != 0 && is_login == false){
            System.out.println("请先登录！");
        }else if (user_num != 0 && is_login == true){
            System.out.println("[奖富抽奖系统>登出]");
            System.out.println("成功登出！");
            is_login = false;
        }
    }
}