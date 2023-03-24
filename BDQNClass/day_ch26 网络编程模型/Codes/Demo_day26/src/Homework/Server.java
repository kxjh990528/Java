package Homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/17 14:10
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Server {
    public static void main(String[] args) {
        //1.创建ServerSocket对象
        try {
            ServerSocket serverSocket = new ServerSocket(7788);//指定端口
            //2.等待客户端来连
            System.out.println("等待客户端连接中...");
            while (true){
                Socket socket = serverSocket.accept();
                //开启线程：创建线程支持多端链接
                Task task = new Task(socket);
                Thread thread = new Thread(task);
                thread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
