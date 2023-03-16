package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 10:20
 * @Java version: 1.8.0_361
 * @Description:使用FileOutputStream来读文件
 */
public class Demo5 {
    public static void main(String[] args) {
        try {
            //1.创建使用FileOutputStream对象
            FileInputStream fileInputStream = new FileInputStream("d:\\a.txt");
            //2.进行读取操作
            //2.1一次读取一个
            //int math = fileInputStream.read();
            //System.out.println((char)math);
            //2.2读取所有内容
            /*int math;
            while ((math = fileInputStream.read()) != -1){
                System.out.println((char)math);
            }*/
            //2.3读取多个字节
            byte[] bytes = new byte[fileInputStream.available()];
            //fileInputStream.available();  //文件的大小
            System.out.println(fileInputStream.read(bytes) + " bytes");
            //将字节数组转化为字符串
            String str = new String(bytes);
            System.out.println(str);
            //3.关闭资源
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
