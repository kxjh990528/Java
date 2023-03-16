package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 11:07
 * @Description:使用数组
 */
public class Demo {
    public static void main(String[] args) {
        //1.声明数组
        //数据类型[] 数组名称;
        int [] maths;
        //2.给数组分配空间
        //数组名称 = new 数据类型[数组长度];
        maths = new int[4];
        //3.数组赋值 注意：索引位置从0开始
        //数组名[索引位置] = 值;
        maths[0] = 5;
        maths[1] = 10;
        maths[2] = 15;
        maths[3] = 20;
        //4.获取属猪中的值（元素）
        System.out.println(maths[0]);
        //5.使用循环控制数组输出
        for (int i = 0; i < maths.length; i++) {
            System.out.println(maths[i]);
        }
        //6.获取数组长度
        //数组名称.length
        //7.定义数组并分配内存空间
        //数据类型 []数组名 = new 数据类型[长度];
        //int [] maths = new int[4];
        //8.定义数组并初始化
        //数据类型 []数组名称 = new 数据类型[]{元素1, 元素2...};
        //数据类型 []数组名称 = {元素1, 元素2...};
        //int [] maths = new int[]{5, 10, 15, 20};
        int [] maths1 = {5, 10, 15, 20}; //必须写成一行
    }
}
