package Demo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 17:22
 * @Java version: 1.8.0_361
 * @Description:示例一:使用FileWriter进行写文件
 */
public class Demo1 {
    public static void main(String[] args) {
        //使用FileWriter写文件
        try {
            FileWriter fileWriter = new FileWriter("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\a.txt", true);//替换
            //2.写内容
            //2.1 写入单个字符
            fileWriter.write('张');
            //2.2写入字符春
            fileWriter.write(",张三");
            //3.关闭流
            //3.1清空流
            fileWriter.flush();
            //3.2关闭流
            fileWriter.close();
            System.out.println("写入完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
