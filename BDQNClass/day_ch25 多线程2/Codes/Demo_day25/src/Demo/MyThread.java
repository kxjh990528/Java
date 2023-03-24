package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 14:23
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyThread extends Thread{
   /* public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ":" + i);
        }
    }*/
   @Override
   public void run() {
       for (int i = 1; i <=10 ; i++) {
           System.out.println(Thread.currentThread().getName()+"="+i);
           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}
