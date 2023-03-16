package Demo;

import java.io.*;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 19:20
 * @Java version: 1.8.0_361
 * @Description:4.使用BufferedReader读取文件信息(按行读取)
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            //1.创建流对象
            FileReader fileReader = new FileReader("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\b.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //2.读操作
            //2.1按行读取
            //String line = bufferedReader.readLine();
            //System.out.println(line);
            //2.2读取所有
            System.out.println("学号\t姓名\t性别");
            String line;
            while ((line = bufferedReader.readLine()) != null){
                //System.out.println(line);
                String[] infos = line.split(",");
                System.out.println(infos[0] + "\t" + infos[1] + "\t" + infos[2]);
            }
            //3.关闭对象
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
