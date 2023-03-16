package Demo;

import java.io.*;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 9:06
 * @Java version: 1.8.0_361
 * @Description:4.使用ObjectOutputStream实现序例化的步骤:
 *
 * 注意:只有实现了java.io. Serializable接口的类才支持序列化操作.
 */
public class Demo5 {
    public static void main(String[] args) {
        //创建一个学生
        Student student = new Student();//此对象保存在内存中 暂时
        student.id = 101;
        student.name = "张三";
        student.gender = "男";
        student.show();

        //将java对象序列化到文件中
        //1.创建ObjectoutputStream对象
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\obj.txt", true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //2.写对象
            objectOutputStream.writeObject(student);
            //3.关闭流
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("写入完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
