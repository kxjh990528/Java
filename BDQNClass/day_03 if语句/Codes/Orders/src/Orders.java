import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 19:18
 * @Description:6.请用户输入三个数，显示三个的由大到小的顺序
 */
public class Orders {
    public static void main(String[] args) {
        int first;  //第一个数
        int second;  //第二个数
        int third;  //第三个数

        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        first = input.nextInt();
        System.out.print("请输入第二个数：");
        second = input.nextInt();
        System.out.print("请输入第三个数：");
        third = input.nextInt();
        if (first > second){
            if (third < second){
                System.out.println("显示的顺序为：" + first + " " + second + " "  + third);
            }else if (third > second){
                if (third > first){
                    System.out.println("显示的顺序为：" + third + " "  + first + " "  + second);
                }else if (third < first){
                    System.out.println("显示的顺序为：" + first + " "  + third + " "  + second);
                }
            }
        }else if (first < second){
            if (third < first){
                System.out.println("显示的顺序为：" + second + " "  + first + " "  +third);
            }else if (third > first){
                if (third > second){
                    System.out.println("显示的顺序为：" + third + " "  + second + " "  + first);
                }else if (third < second){
                    System.out.println("显示的顺序为：" + second + " "  + third + " "  + first);
                }
            }
        }
    }
}
