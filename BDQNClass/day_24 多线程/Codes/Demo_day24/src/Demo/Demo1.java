package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 9:32
 * @Java version: 1.8.0_361
 * @Description:1. 第一方式:继承Thread类创建线程
 * 1.1定义线程类:创建一个类继承Thread类，并重写run方法
 */
public class Demo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        myThread.setName("线程A：");   //线程对象取名
        //3.启动线程
        t1.start();
        t2.start();
    }
}
