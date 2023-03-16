package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 9:24
 * @Description:NULL
 */
public class Demo2 {
    public static void main(String[] args) {
        int i = 0;  //控制循环次数
        int sum = 0;    //总和

        do {
            sum = sum + i;
            i++;
        }while(i <= 100);
        System.out.println("1-100的总和为：" + sum);
    }
}
