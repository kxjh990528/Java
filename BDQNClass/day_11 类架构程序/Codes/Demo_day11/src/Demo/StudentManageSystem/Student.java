package Demo.StudentManageSystem;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 17:50
 * @Java version: 1.8.0_361
 * @Description:项目需求:学生管理系统
 * 管理学生的信息是:学号xh、姓名name、年龄age…、在读状态 0 在读  1休学
 * 功能：
 * 1.添加功能  2.查询学生   3.退出
 * 2.查询学生分为:1.按姓名查询  2.显示所有  3.返回
 * 效果:
 * 1.添加功能  2.查询学生 3.退出     一级菜单
 * 请选择功能:2
 * 1.按姓名查询  2.显示所有  3.返回    二级菜单
 * 实现学生管理系统类StudentManager:
 * 1.实现菜单的切换
 * 一个菜单输出为一个方法
 * 主菜单:mainMenu  二级菜单:twoMenu
 */
public class Student {
    public int id;   //学号
    public String name; //姓名
    public int age; //年龄
    public short state; //在读状态 0 在读  1休学
}
