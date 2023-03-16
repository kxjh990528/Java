package Homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 16:21
 * @Description:作业二（选做）
 * 在程序中有以下数组
 * String names[]={“张三”,”李四”,”麻子”,”小林子”,”无情”}
 * 存放了所有的学生姓名.
 * 请输入一个姓名，判断学生是否存在
 * 效果如下:
 * 1.输入不存在的情况:
 * 请输入学生姓名:张三丰
 * 没有找到该学生
 * 2.输入存在的情况:
 * 请输入学生姓名:麻子
 * 存在
 * 选做:实现该生在第几个位置
 */
public class Arrays_Student_Names {
    public static void main(String[] args) {
        //System.out.println("查找某个元素在数组中出现的位置，找不到则返回-3：" + Arrays.binarySearch(ary, 8));
        Scanner input = new Scanner(System.in);

        String [] names = new String[]{"张三", "李四", "麻子", "小林子", "无情"};
        String [] results = new String[names.length];
        System.out.print("请输入学生姓名：");
        String name = input.next();
        boolean flag = false;
        int i;
        for (i = 0; i < names.length; i++) {
            if (name.equals(names[i])){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("存在");
            System.out.println("该生在第" + (i + 1) + "个位置");
        }else {
            System.out.println("没有找到该学生");
        }
    }
}
