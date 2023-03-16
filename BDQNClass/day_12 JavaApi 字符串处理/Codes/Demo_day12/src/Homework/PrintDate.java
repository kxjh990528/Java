package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/26 10:20
 * @Java version: 1.8.0_361
 * @Description:4.定义一个以下日期字符串将其转化为****/

import java.util.Scanner;

/**日的格式.
 * String date=”2016-11-26”;
 *         要求 ：1.使用替换方法实现
 *                 Replace方法
 *                2.使用分割拼接字符串实现(Stringbuffer)
 */
public class PrintDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = "2016-11-26";
        //方法一：用StringBuffer转换
        /*String arys[] = date.split("-");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arys.length; i++) {
            stringBuffer.append(arys[i]);
            if (i != arys.length - 1)
            stringBuffer.append("/");
        }
        System.out.println(stringBuffer.toString());*/

        //方法二：直接替换
        date.replace("-", "/");
        System.out.println(date);
    }
}
