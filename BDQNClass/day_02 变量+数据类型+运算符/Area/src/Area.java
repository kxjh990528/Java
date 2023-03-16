import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 11:14
 */
public class Area {
    public static void main(String[] args) {
        System.out.println("请输入半径：");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double area = 3.14 * r * r;
        System.out.println("圆的面积是" + area);
    }
}
