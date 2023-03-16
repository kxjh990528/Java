package Homework.Feeder;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 16:40
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Monkey extends Animal{

    public Monkey() {
        System.out.println("Constructing a monkey...");
    }

    @Override
    public void eat() {
        System.out.println("猴子喂食香蕉。");
    }
}
