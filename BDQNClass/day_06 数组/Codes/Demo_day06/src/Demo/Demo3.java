package Demo;

import java.util.Arrays;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/16 14:29
 * @Description:数组的应用
 */
public class Demo3 {
    public static void main(String[] args) {
        int [] ary = {1, 2};
        int [] arys = {1, 2, 1};

        Arrays.sort(ary);

        System.out.println("判断两数组是否相等：" + Arrays.equals(ary, arys));
        System.out.println("将数组转化为字符串：" + Arrays.toString(ary));
        System.out.println("查找某个元素在数组中出现的位置，找不到则返回-3：" + Arrays.binarySearch(ary, 8));
        //注意：使用binarySearch的前提条件是数组要排序
    }
}
