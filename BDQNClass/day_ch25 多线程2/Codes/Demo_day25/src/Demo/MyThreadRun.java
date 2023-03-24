package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 14:45
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThreadRun implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println(Thread.currentThread().getName()+"抢到了执行权"+i);
        }
    }
}
