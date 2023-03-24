package Demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 16:30
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class ThreadPoolExecutorDemo01 {
    /*
            参数一：核心线程数量
            参数二：最大线程数
            参数三：空闲线程最大存活时间
            参数四：时间单位
            参数五：任务队列
            参数六：创建线程工厂
            参数七：任务的拒绝策略
        */
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        MyThread myThread = new MyThread();
        pool.submit(myThread);
        pool.submit(myThread);

        pool.shutdown();
    }
}
