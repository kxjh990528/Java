package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 15:30
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThreadDaemonDemo {
    public static void main(String[] args) {
        //创建线程对象
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        //设置线程名称
        m1.setName("女神");
        m2.setName("备胎");
        //设置守护线程，当普通线程执行完成之后，守护线程也没有执行下去的必要了
        m2.setDaemon(true);
        //启动线程
        m1.start();
        m2.start();
    }
}
