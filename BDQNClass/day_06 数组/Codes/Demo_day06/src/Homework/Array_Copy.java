package Homework;

import java.util.Arrays;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 15:35
 * @Description:作业三:实现数组拷贝，将以下两个数组的内容复制到另一个数组
 */
public class Array_Copy {
    public static void main(String[] args) {
        int [] ary = new int[]{10, 90, 30, 60};
        int [] ary2 =new int[]{50, 20, 70, 80 ,40};
        int [] ary3 = new int[ary.length + ary2.length];    //存放结果的数组

        /*
        //方法一：遍历赋值
        for (int i = 0; i < ary.length; i++) {
            ary3 [i] = ary[i];
        }

        for (int i = ary.length; i < ary.length + ary2.length; i++) {
            ary3 [i] = ary2[i - ary.length];
        }

         */

        //方法二：使用System.arraycopy()
        System.arraycopy(ary, 0, ary3, 0, ary.length);
        //将ary从0下标开始长度为ary.length的元素复制给ary3从0开始长度为ary.length的元素，
        System.arraycopy(ary2, 0, ary3, ary.length, ary2.length);
        //将ary2从0下标开始长度为ary2.length的元素复制给ary3从ary.length开始长度为ary.length的元素，
        Arrays.sort(ary3);

        /*
        System.out.print("数组1：");
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println();
         */
        System.out.println("数组1：" + Arrays.toString(ary));
        /*
        System.out.print("数组2：");
        for (int i = 0; i < ary2.length; i++) {
            System.out.print(ary2[i] + " ");
        }
        System.out.println();
        */
        System.out.println("数组2：" + Arrays.toString(ary2));
        /*
        System.out.print("最后结果：");
        for (int i = 0; i < ary3.length; i++) {
            System.out.print(ary3[i] + " ");
        }
        System.out.println();
        */
        System.out.print("最后结果：" + Arrays.toString(ary3));
    }
}
