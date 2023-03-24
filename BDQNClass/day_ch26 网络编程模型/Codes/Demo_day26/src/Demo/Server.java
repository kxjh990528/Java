package Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/17 10:19
 * @Java version: 1.8.0_361
 * @Description:上机练习:编写服务器端，等待客户端来连接
 * 创建一个类名Server
 */
//服务端
public class Server {
    public static void main(String[] args) {
        //1.创建ServerSocker对象 并开放端口
        try {
            ServerSocket serverSocket = new ServerSocket(7788);
            System.out.println("我是服务器端...等着客户来连");
            Socket socket = serverSocket.accept();
            System.out.println("已经和客户端连通...");
            //3.获取流对象进行收发信息
            //3.1获取流对象
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            //3.2接收消息
            int len  = 0;   //确定流中有没有数据
            while (len == 0){   //死循环
                len = inputStream.available();
            }
            byte[] bytes = new byte[len];
            inputStream.read(bytes);//读
            String str = new String(bytes);//将字节数组转化为字符串
            System.out.println("服务器收到客户端消息：" + str);
            //3.3发送消息
            String msg = "恭喜你，登入成功！";
            outputStream.write(msg.getBytes());//发消息

            outputStream.flush();
            outputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
