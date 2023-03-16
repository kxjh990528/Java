package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 11:21
 * @Description:示例四:输出以*号代表的三角形
 * *
 * ***
 * *****
 * *******
 * *********
 */
public class Demo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {   //控制行
            for (int j = 1; j <= 2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
