import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 17:00
 * @Description:2.实现计算总页数的功能: 要求是：每页3行信息
 */
public class Pages {
    public static void main(String[] args) {
        int line;   //总行数
        int num = 3;    //每页行数
        int leftover;
        int result;
        System.out.print("请输入总行数：");
        Scanner input = new Scanner(System.in);
        line = input.nextInt();
        leftover = line % num;
        if (leftover == 0){
            result = line / num;
            System.out.println("对应总页数为：" + result);
        }else if (leftover != 0){
            result = line / num + 1;
            System.out.println("对应总页数为：" + result);
        }
    }
}
