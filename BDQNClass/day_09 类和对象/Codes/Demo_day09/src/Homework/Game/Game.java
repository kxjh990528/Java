package Homework.Game;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 22:48
 * @Java version: 1.8.0_361
 * @Description:2.某公司要开发新游戏，请用面向对象的思想设计英雄类，怪物类和武器类。
 * 编写测试类，创建英雄对象，怪物对象和武器对象，并输出各自的信息。其中设定分别如下。
 * Game为测试类
 */
public class Game {
    public static void main(String[] args) {
        //创建英雄对象
        Hero hero = new Hero();

        //创建英雄信息
        hero.hero_name = "特利迦奥特曼";
        hero.hero_hp = 10000;
        hero.hero_showInfo();
        System.out.println();

        //创建怪物对象
        Monster monster = new Monster();
        monster.mons_name = "撒旦迪洛斯";
        monster.mons_hp = 26000;
        monster.mons_type = "机械怪兽";
        monster.mons_showInfo();
        System.out.println();

        //创建武器对象
        Weapon weapon = new Weapon();
        weapon.weap_name = "圆环武装";
        weapon.attack_point = 5000;
        weapon.weap_showInfo();
    }
}
