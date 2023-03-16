package Homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 15:16
 * @Description:作业二：将一组乱序字符进行排序，并且进行升序和逆序输出
 */
public class Array_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char [] arys;

        /*
        //输入字符数组的方式
        for (int i = 0; i < arys.length; i++) {
            arys[i] = input.next().charAt(i);
        }
         */
        arys= new char[]{'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};

        System.out.print("原字符序列：");
        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[i] + " ");
        }
        System.out.println();

        Arrays.sort(arys);
        System.out.print("升序排序后：");
        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[i] + " ");
        }
        System.out.println();

        System.out.print("逆序输出为：");
        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[arys.length - 1 -i] + " ");
        }
    }
}
