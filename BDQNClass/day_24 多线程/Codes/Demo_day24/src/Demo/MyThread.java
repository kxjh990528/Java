package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 9:58
 * @Java version: 1.8.0_361
 * @Description:1. 第一方式:继承Thread类创建线程
 * 1.1定义线程类:创建一个类继承Thread类，并重写run方法
 */
//定义线程类
public class MyThread extends Thread{
    @Override
    public void run() {
        //子线程完成的任务模块
        for (int i = 10; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + "=" + i);
        }
    }




}
