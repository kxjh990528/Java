package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 20:07
 * @Java version: 1.8.0_361
 * @Description:1.使用类的方式描述计算机。
 * 提示：计算机的各部件可以作为类的属性，showInfo()方法用于显示输出计算机相关配置信息。
 * 计算机的主要部件包括CPU,主板，显示器，硬盘，内存等。
 */
public class Computer {
    public String CPU;  //CPU信息
    public String GPU;  //显卡信息
    public String mainboard;    //主板信息
    public String displayer;    //显示器信息
    public String hard_disk;    //硬盘信息
    public String RAM;  //内存信息

    public void showInfo(){
        System.out.println("CPU信息：" + CPU);
        System.out.println("显卡信息：" + GPU);
        System.out.println("主板信息：" + mainboard);
        System.out.println("显示器信息：" + displayer);
        System.out.println("硬盘信息：" + hard_disk);
        System.out.println("内存信息：" + RAM);
    }

    public static void main(String[] args) {
        Computer com = new Computer();
        com.CPU = "11th Gen Intel(R) Core(TM) i7-11800H @ 2.30GHz   2.30 GHz";
        com.GPU = "显卡：NVIDIA GeForce RTX 3050 Laptop GPU";
        com.mainboard = "主板：惠普 88F9（LPC Controller - 438B）";
        com.hard_disk = "镁光MTFDKBA512TFH-1BC1AABHA(固态硬盘)";
        com.RAM = "内存：16 GB ( 三星 DDR4 3200MHz 8GB x 2 )";

        com.showInfo();
    }
}
