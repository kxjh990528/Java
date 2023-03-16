package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 10:12
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo {
    public static void main(String[] args) {
        //程序世界
        //1.实例化类的过程 (创建对象)
        //类名 对象名=new 类名();
        Car car1=new Car();  //车对象
        //2.使用对象
        //2.1访问对象的属性
        //对象名.属性名[=值];
        car1.color="黑色";
        car1.brand="法拉利";
        car1.price=360; //w

        //3.输出车的信息
        System.out.println("车的颜色是:"+car1.color);
        System.out.println("车的品牌是:"+car1.brand);
        System.out.println("车的价格是:"+car1.price);
    }
}
