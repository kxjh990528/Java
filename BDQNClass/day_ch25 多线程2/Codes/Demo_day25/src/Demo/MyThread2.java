package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 15:24
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + "在守护" + i);
        }
    }
}
