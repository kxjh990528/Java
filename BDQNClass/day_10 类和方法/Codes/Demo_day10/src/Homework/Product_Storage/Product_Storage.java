package Homework.Product_Storage;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 10:15
 * @Java version: 1.8.0_361
 * @Description:作业二:模拟实现商品入库功能:
 *   要求:使用商品数组存储信息
 *    Product [] ps=new Product[3];
 *   效果如下:
 *   1.添加商品信息 (加三个) 2.查看所有商品信息
 *    循环控制操作
 */
public class Product_Storage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product []ps = new Product[3];
        //这条语句只是创建了n个对象的引用。
        //需要为每一个对象引用创建新的对象，不然会报Javajava.lang.NullPointerException空指针问题
        /*//创建新对象
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Product();
        }*/

        for (int i = 0; i < ps.length; i++) {
            Product product = new Product();
            System.out.print("请输入第" + (i+1) + "个商品的编号：");
            product.id = input.nextInt();
            System.out.print("请输入第" + (i+1) + "个商品的名称：");
            product.name = input.next();
            System.out.print("请输入第" + (i+1) + "个商品的价格：");
            product.price = input.nextDouble();
            ps[i] = product;
            System.out.println();
        }
        for (int i = 0; i < ps.length; i++) {
            System.out.print("第" + (i+1) + "个商品的信息：");
            ps[i].show();
            System.out.println();
        }
    }
}
