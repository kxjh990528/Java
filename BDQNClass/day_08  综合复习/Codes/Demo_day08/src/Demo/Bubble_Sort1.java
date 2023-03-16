package Demo;

import java.util.Arrays;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 9:27
 * @Java version: 1.8.0_361
 * @Description:冒泡排序
 */
public class Bubble_Sort1 {
    public static void main(String[] args) {
        int ary[] = {5, 9 , 7, 1};

        System.out.println("排序前：");
        System.out.println(Arrays.toString(ary));

        //升序
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length - 1; j++) {
                if (ary[j] > ary[j+1]){
                    int tmp;
                    tmp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = tmp;
                }
            }
        }
        /*//降序
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length - 1; j++) {
                if (ary[j] < ary[j+1]){
                    int tmp;
                    tmp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = tmp;
                }
            }
        }*/
        System.out.println("排序后：");
        System.out.println(Arrays.toString(ary));
    }
}
