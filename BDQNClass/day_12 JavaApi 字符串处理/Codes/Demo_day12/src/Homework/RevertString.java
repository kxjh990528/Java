package Homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/26 11:42
 * @Java version: 1.8.0_361
 * @Description:实现字符串的反转【面试题】
 *    现有一个字符串:”abcdefg”   反转以后 “gfedcba”
 * 方法一：StringBuffer对象的反转方法实现
 * sb.reverse()
 * 方法二[选做]:自己写出实现过程代码:
 * 实现思想如下:
 * 1.定义字符数组存放所有的字符串的字符
 * Char []cs=new Char[字符串的长串];
 * a.循环将字符串的字符装入数组
 * b.将字符串直接变为字符数组
 * 字符串.toCharArray();
 * 2.实现数组的中的字符倒序  ///////
 * 3.将字符数组变为新字符串
 * String newstr=new String(字符数组);
 */
public class RevertString {
    public static void main(String[] args) {
        //方法一：StringBuffer对象的反转方法实现
        /*StringBuffer stringBuffer = new StringBuffer("abcdefg");
        System.out.println(stringBuffer.reverse().toString());*/
        //方法二[选做]:自己写出实现过程代码
        String s = "abcdefg";
        char []cs = s.toCharArray();
        char []tmp = new char[cs.length];
        for (int i = 0; i < cs.length; i++) {
            tmp[cs.length - i - 1] = cs[i];
        }
        String newstr = Arrays.toString(tmp);
        System.out.println(newstr);
    }
}
