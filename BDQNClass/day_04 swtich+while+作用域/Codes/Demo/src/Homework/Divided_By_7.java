package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 11:06
 * @Description:作业三.使用while循环结构实现：1至50 之间能被7的整除的数值之和并输出
 */
public class Divided_By_7 {
    public static void main(String[] args) {
        int i = 1;  //控制循环次数
        int sum = 0;    //总和

        while (i <= 50) {

            if (i % 7 == 0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("1-50之间能被7整除的数的和为：" + sum);
    }
}
