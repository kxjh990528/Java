package Homework.Product_Storage;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 9:51
 * @Java version: 1.8.0_361
 * @Description:作业一:
 * 使用面向对象的方式存储一个商品[Product]的信息
 *   商品包含的信息有:【商品编号id，商品名称 name，商品单价 price】
 *   定义一个输出商品信息的方法：show()
 */
public class Product {
    public int id;  //商品编号
    public String name; //商品名称
    public double price;    //商品单价

    public void show(){
        System.out.println("商品编号：" + id);
        System.out.println("商品名称：" + name);
        System.out.println("商品单价：" + price);
    }

}
