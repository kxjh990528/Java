package Demo.Demo1;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 9:47
 * @Java version: 1.8.0_361
 * @Description:NULL
 */

//USB接口
public interface Usb {
    //只能定义抽象方法
    //public abstract void work();
    void work();

    //属性只能为静态常量属性
    public static String name = "张三";
    int tmp = 5;
}
