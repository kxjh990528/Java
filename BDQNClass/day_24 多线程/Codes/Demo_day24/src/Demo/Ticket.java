package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 10:42
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//抢票类
public class Ticket implements Runnable{
    //定义变量存放余票
    private int count = 10; //余票
    private int num = 0;    //已售多少张票

    @Override
    public void run() {
        while(true){
            if(sell()){
                break;  //退出环循
            }
        }
    }

    //编写方法抢票
    public synchronized boolean sell(){  //同步方法
        if(count == 0)
            return true;

        //售票
        count--;
        num++;

        String name=Thread.currentThread().getName();
        System.out.println(name+":抢到第" + num + "张票，还有" + count + "张票");

        try {
            Thread.sleep(500);   //网络延时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
