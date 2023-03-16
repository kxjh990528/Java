package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 10:01
 * @Java version: 1.8.0_361
 * @Description:5.使用ObjectInputStream实现反序化的步骤:
 */
public class Demo6 {
    public static void main(String[] args) {
        //实现反序列实例化
        //1.创建ObjectInputStream对象
        try {
            FileInputStream fileInputStream =
                    new FileInputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\obj.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //2.读操作
            Student student = (Student) objectInputStream.readObject();
            System.out.println(objectInputStream.available());
            //3.关闭流
            objectInputStream.close();
            fileInputStream.close();
            student.show();//操作对象
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
