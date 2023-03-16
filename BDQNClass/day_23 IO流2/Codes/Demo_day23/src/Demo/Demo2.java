package Demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 17:32
 * @Java version: 1.8.0_361
 * @Description:3.使用FileReader读文本文件
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.创建FileReader对象
        try {
            FileReader fileReader = new FileReader("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\a.txt");
            //2.读文件
            //2.1一次一个字符
            //int tmp = fileReader.read();
            //System.out.println((char) tmp);
            //2.2循环读取所有字符
            /*int tmp;
            while ((tmp = fileReader.read()) != -1){
                System.out.println((char)tmp);
            }*/
            int c;
            StringBuffer stringBuffer = new StringBuffer();
            while ((c = fileReader.read()) != -1){
                //System.out.println((char) c);
                stringBuffer.append((char) c);
            }
            System.out.println(stringBuffer.toString());
            //2.3采用字符数组读取内容     了解
            /*char[] chars = new char[5];
            int tmp;
            String allStr = "";
            while ((tmp = fileReader.read(chars)) != -1) {
                allStr = allStr + new String(chars, 0, tmp);
            }
            System.out.println(allStr);*/
            //3.关闭流
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
