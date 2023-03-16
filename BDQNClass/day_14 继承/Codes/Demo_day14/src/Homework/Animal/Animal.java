package Homework.Animal;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:03
 * @Java version: 1.8.0_361
 * @Description:作业一:设计Bird、Fish类、都继承自Animal，实现方法info(),并输出它们的信息,参考运行结果如图：
 *
 * 提示:定义类Animal，具有age属性.info()方法
 * 定义bird类 具有本身的特有属性color;
 * 定义Fish类 具有本身的特有属性weight;
 */
public class Animal {
    private int age;    //年龄

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("今年" + this.age + "岁");
    }
}
