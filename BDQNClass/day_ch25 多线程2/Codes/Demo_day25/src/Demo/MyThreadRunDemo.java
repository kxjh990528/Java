package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 14:46
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThreadRunDemo {
    public static void main(String[] args) {
        //创建MyThread对象，线程干活的类
        MyThreadRun mt = new MyThreadRun();
        //创建Thread线程对象
        Thread t1 = new Thread(mt, "线程一");
        Thread t2 = new Thread(mt, "线程二");

        //设置线程一的优先级为10 最高
        t1.setPriority(10);
        //启动线程
        t1.start();
        t2.start();
    }
}
