package Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 16:18
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class ExecutorsDemo02 {
    public static void main(String[] args) {
        //1.创建线程池对象
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
        //2.创建线程任务对象
        MyThread myThread = new MyThread();
        //3.从线程池中调取线程执行任务
        executorService2.submit(myThread);
        executorService2.submit(myThread);
        executorService2.submit(myThread);
        //4.关闭线程池
        executorService2.shutdown();
    }
}
