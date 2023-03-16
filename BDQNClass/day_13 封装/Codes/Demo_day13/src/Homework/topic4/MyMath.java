package Homework.topic4;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 14:13
 * @Java version: 1.8.0_361
 * @Description:4．[选做]定义一个数组存放着1到100的奇数
 *    定义一个工具类MyMath
 *            属性：int [] arys=new int[50];
 *            利用构造方法:实现数组的初始化
 *            有以下方法实现获取数组从某位置开始到某位置结束【注意:结束位置可不给，默认是到最后】的所有值之和进行返回
 *    编写TestMyMath进行测试
 */
public class MyMath {
    private int []arys = new int[50];

    public MyMath(int[] arys) {
        this.arys = arys;
    }

    public int[] getArys() {
        return arys;
    }

    public void setArys(int[] arys) {
        this.arys = arys;
    }

    public int sum(int start, int[]arys){
        int sum = 0;
        for (int i = start - 1; i < arys.length; i++) {
            sum = sum + arys[i];
        }
        return sum;
    }
}
