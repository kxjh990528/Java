package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 10:07
 * @Java version: 1.8.0_361
 * @Description:2.实现Runnable接口创建线程(推荐用)
 * 2.1创建一个类去实现Runnable接口并实现run方法
 */
public class MyThreadRun implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 10; i++) {
            System.out.println("我是" + name + ":" + i);
            //休眠
            try {
                Thread.sleep(2000); //一秒等于一千毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
