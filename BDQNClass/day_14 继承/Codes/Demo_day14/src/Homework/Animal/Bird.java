package Homework.Animal;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:05
 * @Java version: 1.8.0_361
 * @Description:作业一:设计Bird、Fish类、都继承自Animal，实现方法info(),并输出它们的信息,参考运行结果如图：
 * 运行结果为:
 * 我是一只红色的鸟!
 * 今年4岁
 *
 * 提示:定义类Animal，具有age属性.info()方法
 * 定义bird类 具有本身的特有属性color;
 * 定义Fish类 具有本身的特有属性weight;
 */
public class Bird extends Animal{
    private String color;   //颜色

    public Bird() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info(){
        System.out.println("我是一只" + this.color + "色的鸟");
        super.info();
    }
}
