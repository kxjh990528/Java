package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 11:01
 * @Description:作业二.使用while 循环结构输出：100  95  90  85  ………5。
 */
public class While_Out {
    public static void main(String[] args) {
        int out = 100;    //输出数字
        /*
        while (out >= 5){
            System.out.println(out);
            out = out - 5;
        }
         */
        while (out >= 5){
            if (out % 5 == 0){
                System.out.println(out);
            }
            out--;
        }
    }
}
