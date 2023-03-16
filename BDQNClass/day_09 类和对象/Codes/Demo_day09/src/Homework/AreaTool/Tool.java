package Homework.AreaTool;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 10:18
 * @Java version: 1.8.0_361
 * @Description:4 . 请用面向对象的方式求圆的面积。[重点理解属性的作用:从类外接收信息到类的内部]
 * 要求: 定义一个工具类Tool
 *       属性： 半径 r
 *       方法:显示该半径对应圆的积为多少 show
 *   效果如下:
 *   请输入圆的半径:2
 * 半径为2圆的面积为:12.56
 * 是否是继续操作y|n:
 */
public class Tool {
    public int r;  //半径
    public double area;
    public void show(int r){
        area = 3.14 * r * r;
        System.out.println("半径为"+ r + "圆的面积为：" + area);
    }
}
