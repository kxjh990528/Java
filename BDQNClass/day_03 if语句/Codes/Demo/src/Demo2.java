import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 10:14
 */
public class Demo2 {
    public static void main(String[] args) {
        int Chinese;
        int math;

        Scanner input = new Scanner(System.in);
        System.out.print("请输入语文成绩：");
        Chinese = input.nextInt();
        System.out.print("请输入数学成绩：");
        math = input.nextInt();
        if (Chinese >= 60 && math >= 60) {
            System.out.println("通过考试");
        }else {
            System.out.println("未通过考试");
        }
    }
}
