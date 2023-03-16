package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 11:08
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Tools {

    public void getArea(int r){
        double res = 3.14 * r * r;
        System.out.println("圆的面积是:" + res);
    }
    //在一个类中能不能出现同名的方法---可以
    public void getArea(float r){
        double res = 3.14 * r * r;
        System.out.println("圆的面积是:" + res);
    }

    //求长方形的面积
    public void getArea(int c,int k){
        double res = c * k;
        System.out.println("长方形的面积是:" + res);
    }
}
