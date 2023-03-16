package Homework.Feeder;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/2 15:02
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//鸽子类
public class Dove extends Animal{
    public Dove() {
        System.out.println("Constructing a dove...");
    }

    @Override
    public void eat() {
        System.out.println("鸽子喂食小米。");
    }
}
