package Demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 17:31
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThreadAtom implements Runnable{
    //出现问题：count++ 不是一个原子性操作, 他在执行的过程中,有可能被其他线程打断
   /* private int count = 0; //送冰淇淋的数量
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //1,从共享数据中读取数据到本线程栈中.
            //2,修改本线程栈中变量的值
            //3,会把本线程栈中变量的值赋值给共享数据.
            count++;
            System.out.println("已经送了" + count + "个冰淇淋");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    //private int count = 0; //送冰淇淋的数量
    private AtomicInteger atom=new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //count++;
            int count = atom.incrementAndGet();   //实现相加取值
            System.out.println(Thread.currentThread().getName()+"已经送了" + count + "个冰淇淋");  //1
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

