package Homewrok;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 15:29
 * @Description:作业3:显示1-200每个数字对应的字符是什么?
 * for(int i = 1 ; i < = 200 ; i + +){
 *   System.out.print((char)i);
 * }
 */
public class Num_toString {
    public static void main(String[] args) {
        for(int i=1;i<=200;i++){
            System.out.println(i + " " + (char)i);
        }
    }
}
