package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 11:46
 * @Description:作业四:统计1-100之间，能被3和5同时整除的数有多少个.
 */
public class Count_Divided_by_3_5 {
    public static void main(String[] args) {
        int count = 0;  //计数器
        int i = 1;  //控制循环次数

        while (i <= 100){
            if (i % 3 == 0 && i % 5 ==0) {
                count++;
            }
            i++;
        }
        System.out.println("1-100之间能同时被3和5整除的数有" + count + "个");
    }
}
