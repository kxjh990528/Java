package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 12:14
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class TestTicket {
    public static void main(String[] args) {
        //创建线程
        Ticket ticket = new Ticket();
        //2.创建线程对象
        Thread t1 = new Thread(ticket, "车站窗口");
        Thread t2 = new Thread(ticket, "网络");
        Thread t3 = new Thread(ticket, "小黄牛");
        //3.启动
        t1.start();
        t2.start();
        t3.start();
    }
}
