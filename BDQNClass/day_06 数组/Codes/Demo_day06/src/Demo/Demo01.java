package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 9:45
 * @Description:1.使用数组存放三个学生姓名，并循环显示
 *  要求:
 *    1.先定义  2.分配空间  3.赋值   4.显示
 *    5.使用定义数组并初始化
 */
public class Demo01 {
    public static void main(String[] args) {

        //String names[];
        String [] names;
        names = new String[3];
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //5.定义数组并且初始化
        String names1 []= new String []{"杨过", "小龙女", "张三"};
        String names2 []={"张三","杨过","小龙女"};
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
    }
}
