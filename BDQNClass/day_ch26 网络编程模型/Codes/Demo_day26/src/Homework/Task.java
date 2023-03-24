package Homework;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/17 16:22
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Task implements Runnable{
    private Socket socket;
    private static int count = 0;

    public Task() {
    }

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("接通...");
            //3.利用socket接收消息
            //3.1获取输入流
            InputStream inputStream = socket.getInputStream();
            //3.2读取消息
            //循环保存，流中没有数据
            int len = 0;    //确定流中没有数据
            while (len == 0){
                len = inputStream.available();
            }
            byte[] bytes = new byte[len];
            inputStream.read(bytes);//读
            //将字节数组转化为字符串
            String str = new String(bytes);
            count++;
            System.out.println("服务器收到客户端的消息" + count + "：" + str);

            //4.获取输出流发送消息
            OutputStream outputStream = socket.getOutputStream();
            String msg = "恭喜你！登入成功";
            outputStream.write(msg.getBytes());
            System.out.println("消息发送成功！");

            //关闭流
            outputStream.flush();//清空流
            outputStream.close();
            inputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
