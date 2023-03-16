package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 11:39
 * @Java version: 1.8.0_361
 * @Description:综合练习：实现文件的复制
 */
public class Demo6 {
    public static void main(String[] args) {
        //将d://15.jpg 复制到F:15.jpg
        try {
            FileInputStream fileInputStream = new FileInputStream("d://a.txt");    //读文件
            FileOutputStream fileOutputStream =new FileOutputStream("d://Program Files//a.txt");  //写文件
            //读文件
            int c;
            while ((c = fileInputStream.read()) != -1){
                fileOutputStream.write(c);
            }
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
