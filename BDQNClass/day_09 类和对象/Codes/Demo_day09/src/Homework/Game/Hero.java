package Homework.Game;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 22:39
 * @Java version: 1.8.0_361
 * @Description:2.某公司要开发新游戏，请用面向对象的思想设计英雄类，怪物类和武器类。
 * 编写测试类，创建英雄对象，怪物对象和武器对象，并输出各自的信息。其中设定分别如下。
 * 英雄类
 * 属性：英雄名字，生命值。
 * 方法：输出基本信息。
 */
public class Hero {
    public String hero_name;   //英雄名字
    public int hero_hp;    //生命值

    public void hero_showInfo(){
        System.out.println("英雄名字：" + hero_name);
        System.out.println("英雄生命值：" + hero_hp);
    }
}
