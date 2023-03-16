import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 10:14
 */
public class Demo3 {
    public static void main(String[] args) {
        int Chinese;
        int math;

        Scanner input = new Scanner(System.in);
        System.out.print("请输入语文成绩：");
        Chinese = input.nextInt();
        System.out.print("请输入数学成绩：");
        math = input.nextInt();

        if (Chinese >= 60) {
            //语文通过了
            if (math >= 60) {
                //数学通过了
                System.out.println("通过考试");
            } else {
                //数学没通过
                System.out.println("数学未通过");
            }
        }else {
            //语文没通过
            if (math >= 60) {
                //数学通过了
                System.out.println("语文未通过");
            } else {
                //数学没通过
                System.out.println("都未通过");
            }
        }
    }
}
