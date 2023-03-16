package Homework.Game;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 22:53
 * @Java version: 1.8.0_361
 * @Description:.某公司要开发新游戏，请用面向对象的思想设计英雄类，怪物类和武器类。
 *  编写测试类，创建英雄对象，怪物对象和武器对象，并输出各自的信息。其中设定分别如下。
 *  怪物类
 *  属性：怪物名字，生命值，类型。
 *  方法：输出基本信息。
 */
public class Monster {
    public String mons_name;    //怪物名字
    public int mons_hp;    //怪物生命值
    public String mons_type;   //怪物类型

    public void mons_showInfo(){
        System.out.println("怪物名字：" + mons_name);
        System.out.println("怪物生命值：" + mons_hp);
        System.out.println("怪物类型：" + mons_type);
    }
}
