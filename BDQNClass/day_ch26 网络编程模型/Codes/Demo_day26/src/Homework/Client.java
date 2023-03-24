package Homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/17 15:51
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.创建socket对象
        try {
            Socket socket = new Socket("localhost", 7788);
            System.out.println("连接服务器中...已接通");
            System.out.print("请输入要输入的信息：");
            String in = scanner.next();
            //2.利用socket对象收发消息
            //2.1基于socket获取流对象
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            //2.2写（发）消息
            String str = in;
            outputStream.write(str.getBytes());
            System.out.println("发送成功!");
            //2.3收信息
            int len = 0;
            while (len == 0){
                len = inputStream.available();
            }
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);//读
            String msg = new String(bytes);//将字节数组转化为字符串
            System.out.println("客户端收到服务器消息：" + msg);
            //关闭资源
            outputStream.flush();
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
