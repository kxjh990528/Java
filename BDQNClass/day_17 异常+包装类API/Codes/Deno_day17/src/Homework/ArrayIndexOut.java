package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 15:17
 * @Java version: 1.8.0_361
 * @Description:作业三:编写能产生ArrayIndexOutOfBoundsException异常的代码，并将其捕获，在控制台上输出异常信息。
 */
public class ArrayIndexOut {
    public static void main(String[] args) {
        try {
            int []a = new int[]{1, 2, 3, 4, 5};
            for (int i = 0; i < 6; i++) {
                System.out.println(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Error：ArrayIndexOutOfBoundsException\n数组下标越界");
        }
    }
}
