import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 9:41
 */
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入语文成绩：");
        int grade = input.nextInt();
        if (grade >= 60){
            System.out.println("合格");
        }else {
            System.out.println("不合格");
        }
    }
}
