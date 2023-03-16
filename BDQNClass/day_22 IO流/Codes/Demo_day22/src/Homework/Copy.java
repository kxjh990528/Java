package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 14:30
 * @Java version: 1.8.0_361
 * @Description:作业:
 * 作业一:使用字节流来实现复制文件
 *      复制某盘下的图片
 */
public class Copy {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\素材\\图片\\IMG_7918.PNG");
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Program Files\\杰哥.PNG");
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
