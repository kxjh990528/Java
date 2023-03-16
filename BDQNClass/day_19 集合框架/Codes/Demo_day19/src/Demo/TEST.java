package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 18:15
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class TEST {
    public static void main(String[] args) {
        int [] a =new int[]{0, 1, 2, 3, 4, 5};
        int b = 0;
        for (int i:a) {
            b++;
            System.out.println(a[i] + " " + b);
        }
    }
}
