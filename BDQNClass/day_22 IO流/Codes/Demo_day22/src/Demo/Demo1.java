package Demo;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 19:49
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo1 {
    public static void main(String[] args) {
        //在d盘中创建文件 a.txt
        //1.创建File类对象 (注意：一个File类的对象对应一个文件)
        File file = new File("d:/a.txt");
        //2.使用file对象的方法操作稳健
        try{
            //2.2判断文件是否存在 存在返回true，反之false
            if (file.exists()){
                System.out.println("文件已存在");
                file.delete();  //删除文件
                System.out.println("删除文件成功");
            }else {
                //2.1创建文件
                file.createNewFile();
                System.out.println("创建文件成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
