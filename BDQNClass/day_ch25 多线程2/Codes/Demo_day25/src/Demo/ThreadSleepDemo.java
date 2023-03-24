package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 14:37
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <=100 ; i++) {
            System.out.println("每隔一秒执行一次"+i);

            //sleep(long millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数
            //参数为毫秒级， 1秒=1000毫秒
            Thread.sleep(1000);
        }
    }
}
