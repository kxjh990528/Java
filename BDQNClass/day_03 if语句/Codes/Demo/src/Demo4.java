import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 11:42
 * @Description:NULL
 */
public class Demo4 {
    public static void main(String[] args) {
        //需求:请输入语文成绩，显示对应的等级
        //80以上   优秀
        //70-80之间  良
        //60-70  一般
        //60以下  不合格
        int Chinese;
        Scanner input=new Scanner(System.in);
        System.out.println("输入语文成绩:");
        Chinese=input.nextInt();

        //多重if语句
        if(Chinese >= 80){
            System.out.println("优秀");
        }else if(Chinese < 80 && Chinese >= 70){
            System.out.println("良");
        }else if(Chinese < 70 && Chinese >= 60){
            System.out.println("一般");
        }else {
            System.out.println("不合格");
        }
    }
}
