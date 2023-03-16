package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 14:35
 * @Description:数组插入算法的实现
 * //插入元素
 * int pos = 2; //指定插入的位置
 * //将插入位置的数依次往后移动位置
 * for (int i = 数组名.length-1; i > 插入的位置; i--) {
 *     temp[i} = temp[i - 1];
 * }
 */
public class Demo4 {
    public static void main(String[] args) {
        //插入的算法
        int [] tmp =new int[10];
        tmp[0] = 5;
        tmp[1] = 10;
        tmp[2] = 15;
        tmp[3] = 20;
        //插入元素
        int pos  = 2;   //指定插入的位置
        //将插入位置的数依次往后移动位置
        for (int i = tmp.length - 1; i > pos ; i--) {
            tmp[i] = tmp[i -1];
        }
        //在插入位置赋值
        tmp[pos] = 100;
        System.out.println("插入元素后的数组内容：");
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }
}
