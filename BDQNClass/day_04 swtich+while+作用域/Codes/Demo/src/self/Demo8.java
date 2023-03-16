package self;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 11:18
 * @Description:1-100的数之和
 */
public class Demo8 {
    public static void main(String[] args) {
        int i = 1;  //控制循环次数
        int sum = 0;    //和

        //1-100累加
        while (i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println("1-100的数的和：" + sum);

        /*
        //1-100奇数和
        while (i <= 100){
            if (i % 2 != 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("1-100的奇数和：" + sum);
         */

        /*
        //1-100的偶数和
        while (i <= 100){
            if (i % 2 == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("1-100的偶数和：" + sum);
         */
    }
}
