package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 10:09
 * @Java version: 1.8.0_361
 * @Description:2.实现Runnable接口创建线程(推荐用)
 * 2.1创建一个类去实现Runnable接口并实现run方法
 */
public class Demo2 {
    public static void main(String[] args) {
        //2.创建子线程对象
        //2.1定义线程任务对象
        MyThreadRun myThreadRun = new MyThreadRun();
        //2.2创建线程
        Thread thread = new Thread(myThreadRun);
        thread.setName("线程A");
        thread.start();
        //以下和上面相同
        //new Thread(new MyThreadRun(),"线程A").start();

        //扩展:lambda表达式
        //new Thread(new Runnable() {
            // @Override
            // public void run() {
                // for(int i=1;i<10;i++){
                //System.out.println(i);
            //}
        //}
        //}).start();
        new Thread(()->{
            for(int i=1;i<=10;i++){
                System.out.println(i);
            }
        }).start();
    }
}
