package Homework.Feeder;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 16:36
 * @Java version: 1.8.0_361
 * @Description:选做作业二.假设动物园某管理员每天需要给他所负责饲养的狮子、猴子、和鸽子喂食，用一个程序模拟喂食过程。
 * 1.饲养员喂养动物时，不同的动物执行吃的功能。
 * 2.不同动物吃的东西不同。饲养员喂养动物时，不能使用判断语句判断动物类型。
 * 3.使用抽象方法实现喂养不同动物的多态，不可以使用方法重载。
 *  （1）定义动物类，提供抽象方法Eat()。定义狮子、猴子和各自类重写Eat()方法
 * （2）定义饲养员类，实现一个喂养方法，参数类型为动物类类型。
 */
//饲养员类
public class Feeder {
    public void eat(Animal animal){
        animal.eat();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feeder feeder = new Feeder();
        System.out.println("请输入喂养的动物（狮子/猴子/鸽子）：");
        String animalType = scanner.next();
        if (animalType.equals("狮子")){
            Lion lion = new Lion();
            feeder.eat(lion);
        }else if (animalType.equals("猴子")){
            Monkey monkey = new Monkey();
            feeder.eat(monkey);
        }else if (animalType.equals("鸽子")) {
             Dove dove= new Dove();
            feeder.eat(dove);
        }
    }
}
