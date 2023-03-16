package Homework.Animal;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:05
 * @Java version: 1.8.0_361
 * @Description:作业一:设计Bird、Fish类、都继承自Animal，实现方法info(),并输出它们的信息,参考运行结果如图：
 * 运行结果为:
 * 我是一只5斤重的鱼！
 * 今年2岁
 *
 * 提示:定义类Animal，具有age属性.info()方法
 * 定义bird类 具有本身的特有属性color;
 * 定义Fish类 具有本身的特有属性weight;
 */
public class Fish extends Animal{
    private int weight; //体重

    public Fish() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info(){
        System.out.println("我是一只" + this.weight + "斤重的鱼");
        super.info();
    }
}
