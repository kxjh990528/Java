package Demo;

import java.io.File;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 20:07
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo3 {
    public static void main(String[] args) {
        //获取某目录下的所有文件和文件夹
        //1.创建fILE对象
        File file=new File("d://");
        //2.获取目录下所有资源
        File [] flist=file.listFiles();
        //循环显示所有文件
        for (File f:flist) {
            System.out.print(f.getName()+"\t");
            System.out.print(f.length()+"字节\t");
            if(f.isFile())
                System.out.println("文件");
            else
                System.out.println("文件夹");
            System.out.println();
        }
    }
}
