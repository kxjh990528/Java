package Homework.Animal;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:24
 * @Java version: 1.8.0_361
 * @Description:运行结果为:
 * 我是一只红色的鸟!
 * 今年4岁
 *
 * 我是一只5斤重的鱼！
 * 今年2岁
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setAge(4);
        bird.setColor("红色");
        bird.info();

        Fish fish = new Fish();
        fish.setAge(2);
        fish.setWeight(5);
        fish.info();
    }
}
