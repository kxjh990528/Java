package Homework.Manage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/12 14:39
 * @Java version: 1.8.0_361
 * @Description:作业二:实现人员管理系统
 * 欢迎使用人员管理系统
 * 1.添加人员   2.查看人员
 * 请选择功能:1
 * 输入人员的姓名:王建
 * 保存成功
 * 请选择功能:2
 * 人员信息如下:
 * 王建
 *
 * 要求:将人员信息保存到文件中
 */
public class Manage {
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        System.out.println(">>>>欢迎使用人员管理系统");
        System.out.println("1.添加人员\t\t2.查看人员\t\t3.退出");
        System.out.print("请选择功能：");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                this.save();
                break;
            case 2:
                this.show();
                break;
            case 3:
                System.exit(1);
                break;
            default:
                System.out.println("选择错误请重新输入。");
                this.menu();
                break;
        }
    }

    //保存人员信息
    public void save(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入人员的姓名：");
        String str = scanner.next();
        byte[] bytes = str.getBytes();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\people.txt",true);
            fileOutputStream.write(bytes);
            //fileOutputStream.write('|');
            fileOutputStream.write(',');
            fileOutputStream.close();
            System.out.println("保存成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.menu();
    }

    //显示人员信息
    public void show(){
        System.out.println("人员信息如下：");
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\people.txt");
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            //String[] s = new String(bytes).split(",");
            String s = new String(bytes);
            //for (String name: s.split("\\|")) {//使用'|'当分隔符时，这里必须加转义字符\\
            //for (String name: s) {
            for (String name:s.split(",")){
                System.out.println(name);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.menu();
    }
}
