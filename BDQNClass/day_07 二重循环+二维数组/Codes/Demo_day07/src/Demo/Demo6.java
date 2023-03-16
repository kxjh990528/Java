package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 12:10
 * @Description:示例五：输出以*号代表的等腰三角表
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Demo6 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows ; i++) {  //控制行
            for (int j = 1; j <= rows - i ; j++) {  //控制空格
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1 ; k++) {  //控制*
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
