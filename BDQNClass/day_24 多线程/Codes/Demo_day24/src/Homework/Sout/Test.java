package Homework.Sout;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 14:34
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "=" + i);
                }
            }
        }).start();
    }
}
