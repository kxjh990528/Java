import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 14:32
 * @Description:作业四:请输入行数，就显示多少行的以*号代表的菱形(注意:行数要为奇数行)
 *    *         1   3   1
 *   ***        2   2   3
 *  *****       3   1   5
 * *******      4   0   7
 *  *****       5(1)   1   5    6-1 down*2 - i *2+1
 *   ***        6(2)   2   3    6-3
 *    *         7(3)   3   1    6-5
 */
public class Print_Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows;
        System.out.print("请输入打印的菱形行数（奇数行）：");
        rows = input.nextInt();
        if (rows % 2 == 0){
            System.out.println("输入错误，不是奇数，请重新输入！");
            System.out.print("请输入打印的菱形行数（奇数行）：");
            rows = input.nextInt();
        }
        if (rows % 2 != 0){
            //实心菱形
            //int rows = 7;
            System.out.println("打印效果如下：");
            //上半部分
            int top = (rows + 1) / 2;   //上半部分行数
            for (int i = 1; i <= top; i++) {  //行
                for (int j = 1; j <= top - i; j++)
                    System.out.print(" ");
                for (int k = 1; k <= i * 2 - 1 ; k++)
                    System.out.print("*");
                System.out.println();
            }

            //下半部分
            int down = (rows - 1) / 2;  //下半部分行数
            for (int i = 1; i <= down ; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print(" ");
                for (int k = (down - i) * 2 + 1; k >= 1; k--)
                    System.out.print("*");
                System.out.println();
            }

            //中空菱形
            //int rows = 7;
            System.out.println("打印效果如下：");
            top = (rows + 1) / 2;   //上半部分行数
            for (int i = 1; i <= top; i++) {  //行
                if(i == 1){
                    for (int j = 1; j <= top - i; j++)
                        System.out.print(" ");
                    System.out.println("*");
                }else {
                    for (int k = 1; k <= top - i; k++)
                        System.out.print(" ");
                    System.out.print("*");
                    for (int l = 1; l <= i * 2 - 3; l++)
                        System.out.print(" ");
                    System.out.println("*");
                }

            }

            //下半部分
            down = (rows - 1) / 2;  //下半部分行数
            for (int i = 1; i <= down ; i++) {
                if (i == down){
                    for (int j = 1; j <= i; j++)
                        System.out.print(" ");
                    System.out.println("*");
                }else {
                    for (int k = 1; k <= i; k++)
                        System.out.print(" ");
                    System.out.print("*");
                    for (int l = (down - i) * 2 - 1; l >= 1; l--)
                        System.out.print(" ");
                    System.out.println("*");
                }
            }
        }

    }
}
