package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 12:07
 * @Description:九九乘法表
 */
public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) { //控制行
            for (int j = 1; j <= i ; j++) { //控制列
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
