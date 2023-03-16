package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 19:08
 * @Java version: 1.8.0_361
 * @Description:3.使用BufferedWriter进行写文件（带缓冲区）
 */
public class Demo3 {
    public static void main(String[] args) {
        try {
            //1.创建BufferWriter对象
            FileWriter fileWriter =
                    new FileWriter("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\b.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //2.写操作
            bufferedWriter.write("103,王刚,女");//一行写一个对象相关信息，相关信息使用分隔符隔开
            bufferedWriter.newLine();//换行
            bufferedWriter.write("101,张三,男");//一行写一个对象相关信息，相关信息使用分隔符隔开
            bufferedWriter.newLine();//换行
            bufferedWriter.write("102,张四,男");//一行写一个对象相关信息，相关信息使用分隔符隔开
            bufferedWriter.newLine();//换行
            //3.关闭流
            bufferedWriter.flush();//清空缓冲区（把缓冲区内容输入到文件，效果和close()差不多）
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("写入完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
