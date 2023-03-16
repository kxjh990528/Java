package Homework;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class 五子棋2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //创建棋盘
        String[][] check=new String[23][23];
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 23; j++) {
                check[i][j]=" ";
            }
        }
        for (int i = 4; i < 19; i++) {
            for (int j = 4; j < 19; j++) {
                check[i][j]="十 ";
            }
        }
        //显示战局
        for (int i = 4; i <19; i++) {
            for (int j = 4; j < 19; j++) {
                System.out.print(check[i][j]);
                if (j == 18) System.out.println();
            }
        }
        //开始游戏
        boolean whitewin=true,blackwin=true;
        while (whitewin&&blackwin)//循环游戏
        {   boolean y=true;
            boolean z=true;//判断落子是否有效
            //黑棋落子
            System.out.print("行：");
            int a=input.nextInt();
            System.out.print("列：");
            int b=input.nextInt();
            while (y) {
                if ((a > 15 || a <= 0 || b > 15 || b <= 0)) {
                    System.out.println("无效落子");
                    y=true;
                    System.out.print("行："); a=input.nextInt();
                    System.out.print("列："); b=input.nextInt();
                }
                else {
                    if(check[a+3][b+3]!="十 ")
                    {
                        System.out.println("该位置有其他棋子");
                        y=true;
                        System.out.print("行："); a=input.nextInt();
                        System.out.print("列："); b=input.nextInt();
                    }
                    else {check[a+3][b+3]="黑 ";
                        for (int i = 4; i <19; i++) {
                            for (int j = 4; j < 19; j++) {
                                System.out.print(check[i][j]);
                                if (j == 18) System.out.println();
                            }
                        }
                        y=false;
                        break;
                    }
                }
            }
            //判断输赢
            boolean p=false;
            for (int i = 4; i <19; i++) {
                boolean o=false;
                for (int j = 4; j < 19; j++) {
                    if(
                            (check[i][j].equals("黑 ")&&
                              check[i][j+1].equals("黑 ")&&
                              check[i][j+2].equals("黑 ")&&
                              check[i][j+3].equals("黑 ")&&
                              check[i][j+4].equals("黑 "))||
                            (check[i][j].equals("黑 ")&&
                              check[i+1][j].equals("黑 ")&&
                              check[i+2][j].equals("黑 ")&&
                              check[i+3][j].equals("黑 ")&&
                              check[i+4][j].equals("黑 "))||
                            (check[i][j].equals("黑 ")&&
                             check[i+1][j+1].equals("黑 ")&&
                             check[i+2][j+2].equals("黑 ")&&
                             check[i+3][j+3].equals("黑 ")&&
                             check[i+4][j+4].equals("黑 "))||
                            (check[i][j].equals("黑 ")&&
                             check[i+1][j-1].equals("黑 ")&&
                             check[i+2][j-2].equals("黑 ")&&
                             check[i+3][j-3].equals("黑 ")&&
                             check[i+4][j-4].equals("黑 "))
                    )
                    {  blackwin=false;z=false;o=true;break;}
                } if(o)p=true;break;
            }if(p)break;
            //白棋落子
            System.out.print("行：");int c=input.nextInt();
            System.out.print("列：");int d=input.nextInt();
            while (z) {
                if ((c > 15 || c <= 0 || d > 15 || d <= 0)) {
                    System.out.println("无效落子");
                    z=true;
                    System.out.print("行："); c=input.nextInt();
                    System.out.print("列："); d=input.nextInt();
                }
                else {
                    if(check[c+3][d+3]!="十 "){
                        System.out.println("该位置有其他棋子");
                        z=true;
                        System.out.print("行："); c=input.nextInt();
                        System.out.print("列："); d=input.nextInt();
                    }
                    else {
                        check[c+3][d+3] = "白 ";
                        for (int i = 4; i < 19; i++) {
                            for (int j = 4; j < 19; j++) {
                                System.out.print(check[i][j]);
                                if (j == 18) System.out.println();
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            boolean m=false;
            for (int i = 4; i <19; i++) {
                boolean n=false;
                for (int j = 4; j < 19; j++) {
                    if(
                            (check[i][j].equals("白 ")&&
                                    check[i][j+1].equals("白 ")&&
                                    check[i][j+2].equals("白 ")&&
                                    check[i][j+3].equals("白 ")&&
                                    check[i][j+4].equals("白 "))||
                                    (check[i][j].equals("白 ")&&
                                            check[i+1][j].equals("白 ")&&
                                            check[i+2][j].equals("白 ")&&
                                            check[i+3][j].equals("白 ")&&
                                            check[i+4][j].equals("白 "))||
                                    (check[i][j].equals("白 ")&&
                                            check[i+1][j+1].equals("白 ")&&
                                            check[i+2][j+2].equals("白 ")&&
                                            check[i+3][j+3].equals("白 ")&&
                                            check[i+4][j+4].equals("白 "))||
                                    (check[i][j].equals("白 ")&&
                                            check[i+1][j-1].equals("白 ")&&
                                            check[i+2][j-2].equals("白 ")&&
                                            check[i+3][j-3].equals("白 ")&&
                                            check[i+4][j-4].equals("白 "))
                    )
                    {   whitewin=false;break;}
                }if(n)break;
            }if(m)break;
        }if(blackwin==false) System.out.println("黑棋胜利");
        if(whitewin==false) System.out.println("白棋胜利");
    }
}