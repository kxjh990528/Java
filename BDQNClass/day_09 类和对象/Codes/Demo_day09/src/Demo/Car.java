package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 19:53
 * @Java version: 1.8.0_361
 * @Description:示例:定义车类
 */
public class Car {
    //定义一系列的属性和方法
    //1.定义属性
    public String brand;  //存品牌
    public String color; //颜色
    public int price; //价格
    //定义车跑的方法
    public void run(){
        System.out.println("车正在行驶的过程中......");
    }

    //定义车跑的方法
    public void music(){
        System.out.println("小苹果...小苹果..小苹果.......");
    }
    public static void main(String[] args) {
        //使用类
        //1.创建对象(实例化过程)
        //类名  对象名=new 类名();
        Car car1 = new Car();   //存储

        //2.使用对象的属性和方法
        //使用对象的属性
        //对象名.属性名[=值];
        car1.brand = "神龙";
        car1.color = "黑色";
        car1.price = 8;
        System.out.println("车的品牌是:" + car1.brand);
        System.out.println("车的颜色:" + car1.color);
        System.out.println("车的价格是:" + car1.price+"w");
        //使用对象的方法
        //对象名称.方法名称();
        car1.run();
        car1.music();
    }
}
