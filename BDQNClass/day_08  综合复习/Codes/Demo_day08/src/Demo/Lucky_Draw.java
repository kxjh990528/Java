package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 9:58
 * @Description:幸运抽奖
 */
public class Lucky_Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 9999;
        int min = 1000;
        String flag;
        String username ="";   //保存注册用户名
        String password="";  //保存注册密码
        int cardID; //卡号
        boolean is_registered = false;  //是否注册,true为注册，false为未注册
        boolean is_login = false;   //是否登录，true为已登入，false为未登入
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
                    System.out.println("实现注册");
                    System.out.print("请输入用户名：");
                    username = input.next();
                    System.out.print("请输入密码：");
                    password = input.next();
                    cardID = (int)(Math.random()*(max - min)) + min;
                    is_registered = true;
                    is_login = false;

                    System.out.println("注册成功");
                    System.out.println("用户名："+ username+"\n密 码：" + password + "\n卡 号：" + cardID);
                    break;
                case 2:
                    if (is_registered == false ){
                        System.out.println("请先注册！");
                    }else{
                        System.out.println("实现登入");
                        System.out.print("请输入用户名：");
                        String input_username = input.next();
                        System.out.print("请输入密码：");
                        String input_password = input.next();
                        //验证
                        if (input_username.equals(username) && input_password.equals(password)){
                            System.out.println("登陆成功！");
                            is_login = true;
                        }else {
                            System.out.println("输入有误，请重新输入！");
                            System.out.print("请输入用户名：");
                            input_username = input.next();
                            System.out.print("请输入密码：");
                            input_password = input.next();
                        }
                    }
                    break;
                case 3:
                    if (is_registered == false ){
                        System.out.println("请先注册！");
                    }else if (is_registered == true && is_login == false){
                        System.out.println("请先登录！");
                    }else if (is_registered == true && is_login == true){
                        System.out.println("实现抽奖");
                        System.out.print("请输入你的会员卡号:");
                        int inputCard=input.nextInt();
                        //系统产生5个四位随机卡号
                        int cards[]=new int [5];
                        for(int i = 0; i < cards.length; i++){
                            int randCard = (int)(Math.random() * (max - min)) + min;
                            //装入数组
                            cards[i] = randCard;
                        }
                        //输出产生的随机卡号
                        System.out.println("随机卡号:");
                        for (int i=0;i<cards.length;i++){
                            System.out.print(cards[i]+"\t");
                        }
                        System.out.println(""); //换行

                        //判断卡号在数组中是否有出现
                        boolean fg = false;  //表示不存在
                        for (int i = 0;i < cards.length; i++){
                            if(cards[i]==inputCard){
                                fg = true;  //存在
                            }
                        }
                        if(fg){
                            System.out.println("恭喜中奖！");
                        }else{
                            System.out.println("谢谢惠顾");
                        }
                    }
                    break;
                case 4:
                    if (is_registered == false ){
                        System.out.println("请先注册！");
                    }else if (is_registered == true && is_login == false){
                        System.out.println("请先登录！");
                    }else if (is_registered == true && is_login == true){
                        System.out.println("成功登出！");
                        is_login = false;
                    }
                    break;
                default:
                    System.out.println("输入有误！");
            }

            System.out.println("你是否想继续操作:(y|n)");
            flag=input.next();  //接收输入字符串
        }while (flag.equals("y"));
        System.out.println("系统退出");

    }
}
