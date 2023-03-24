package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 14:26
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        //void setName(String name)：将此线程的名称更改为等于参数 name
        m1.setName("高铁");
        m2.setName("飞机");

        m1.start();
        m2.start();

        //Thread(String name) 通过构造方法把线程名称设置进行
        //MyThread my1 = new MyThread("高铁");
       // MyThread my2 = new MyThread("飞机");

        //my1.start();
        //my2.start();

        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
