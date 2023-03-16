package Homework;

import java.util.Arrays;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 16:13
 * @Description:作业四:练习在以下数组中的第2个位置插入元素(100)
 */
public class Array_Insert {
    public static void main(String[] args) {
        int [] tmp =new int[10];
        tmp[0] = 5;
        tmp[1] = 10;
        tmp[2] = 15;
        tmp[3] = 20;
        //插入元素
        int pos  = 2;   //指定插入的位置
        //将插入位置的数依次往后移动位置
        for (int i = tmp.length - 1; i > pos ; i--) {
            tmp[i] = tmp[i -1];
        }
        //在插入位置赋值
        tmp[pos] = 100;
        System.out.print("插入元素后的数组内容：");
        /*
        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i] + " ");
        }
         */
        System.out.println();
        System.out.println("插入元素后的数组内容：" + Arrays.toString(tmp));
    }
}
