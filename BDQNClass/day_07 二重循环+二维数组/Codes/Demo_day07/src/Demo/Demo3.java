package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 10:53
 * @Description:输出以*号代表的矩形
 */
public class Demo3 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {   //外层控制行
            for (int j = 0; j < 5; j++) {   //内层控制列
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
