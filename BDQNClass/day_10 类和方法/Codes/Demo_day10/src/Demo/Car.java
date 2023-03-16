package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 9:47
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Car {
    //定义一系列的属性(特征)和方法(行为)
    //1.定义属性  语法:访问修饰符   数据类型  属性名=值;
    public String brand;//品牌
    public int price;//价格
    public String color;// 颜色

    public void show(){
        System.out.println("车的颜色是:"+this.color);
        System.out.println("车的品牌是:"+this.brand);
        System.out.println("车的价格是:"+this.price);
    }
}
