package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 15:24
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "在执行" + i);
        }
    }
}