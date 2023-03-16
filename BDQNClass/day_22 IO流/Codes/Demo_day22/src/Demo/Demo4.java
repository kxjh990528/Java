package Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 9:44
 * @Java version: 1.8.0_361
 * @Description:使用FileOutputStream来写文件
 */
public class Demo4 {
    public static void main(String[] args) {
        //使用FileOutputStream来写文件:字节输出流
        String str = "hello,我爱你！";
        //将字符串转化为字节数组
        byte[] bytes = str.getBytes();
        try{
            //1.创建FileOutputStream流对象
            //FileOutputStream fos=new FileOutputStream("D:\\a.txt");
            // 每次重新写入内容
            FileOutputStream fileOutputStream =
                    new FileOutputStream("D:\\a.txt", true);            //以追加方式写入内容
            //2.进行写操作
            //2.1写入单个字符
            fileOutputStream.write('a');
            fileOutputStream.write('\n');
            //2.2写入字节数组
            fileOutputStream.write(bytes);
            //3.关闭资源
            fileOutputStream.close();
            System.out.println("写入成功！");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
