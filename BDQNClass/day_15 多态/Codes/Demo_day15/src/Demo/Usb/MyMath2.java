package Demo.Usb;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 16:45
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyMath2 {
    public static int r;    //半径

    public static void  getArea(){
        //注意：静态方法中可以使用静态属性，不能只使用非静态属性
        int res = 3 * r * r;
        System.out.println("面积是：" + res);
    }

    public static void main(String[] args) {
        //使用类名访问静态成员
        MyMath2.r = 2;
        MyMath2.getArea();
    }
}
