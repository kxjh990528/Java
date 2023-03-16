package Demo;

import java.io.File;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 20:01
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo2 {
    public static void main(String[] args) {
        //获取磁盘中某个文件的信息:如文件名称，文件路径，文件的大小
        //1.创建文件对象
        File file=new File("D:/a.txt");
        //2.获取文件的信息
        System.out.println("文件名称:"+file.getName());
        System.out.println("文件存储位置:"+file.getPath());
        System.out.println("文件的大小:"+file.length()+"字节");
        System.out.println("文件是否隐藏:"+file.isHidden());
        System.out.println("判断是不是文件"+file.isFile());
        System.out.println("判断是不是文件夹"+file.isDirectory());
    }
}
