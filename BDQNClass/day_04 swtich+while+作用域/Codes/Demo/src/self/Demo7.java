package self;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 10:57
 * @Description:输出1-10的奇数，使用判断
 */
public class Demo7 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
