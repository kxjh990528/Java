package Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/17 10:30
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Client {
    public static void main(String[] args) {
        //1.创建soket对象
        //Socket socket = new Socket("服务器IP地址", 服务器端口);
        //本机：localhost、127.0.0.1
        try {
            Socket socket = new Socket("localhost", 7788);
            System.out.println("我是客户端...已接通服务器");
            //2.利用socket对象收发消息
            //2.1基于socket获取流对象
            InputStream inputStream = socket.getInputStream();  //输入流收信息
            OutputStream outputStream = socket.getOutputStream();   //输出流 写信息
            //2.2写（发）信息
            String str = "用户名：admin 密码：123";
            outputStream.write(str.getBytes());
            System.out.println("发送成功!");
            //2.3收消息
            int len = 0;//确定流中有没有数据
            while (len == 0){
                len = inputStream.available();
            }
            byte[] bytes = new byte[len];
            inputStream.read(bytes);//读
            String info = new String(bytes);
            System.out.println("客户端收到服务器的消息：" + info);
            //关闭资源
            outputStream.flush();
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
