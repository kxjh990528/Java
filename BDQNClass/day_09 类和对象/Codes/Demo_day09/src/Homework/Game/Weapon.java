package Homework.Game;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 22:57
 * @Java version: 1.8.0_361
 * @Description:2.某公司要开发新游戏，请用面向对象的思想设计英雄类，怪物类和武器类。
 * 武器类
 * 属性：武器名字，攻击力。
 * 方法：输出基本信息。
 */
public class Weapon {
    public String weap_name;   //武器名字
    public int attack_point;   //武器攻击力

    public void weap_showInfo(){
        System.out.println("武器名字：" + weap_name);
        System.out.println("武器攻击力：" + attack_point);
    }
}
