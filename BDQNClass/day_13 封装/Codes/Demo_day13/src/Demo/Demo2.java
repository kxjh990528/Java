package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 10:14
 * @Java version: 1.8.0_361
 * @Description:上机练习一: 定义一个tools 类
 *    要求: 编定一个方法求面积
 *            支持传一个半径求面积.(支持整数和小数)
 *           支持传长和宽求面积(两个整数)
 */
public class Demo2 {
    public static void main(String[] args) {
        Tools tools = new Tools();
        tools.getArea(3);
        tools.getArea(2);
        tools.getArea(2, 3);
    }
}
