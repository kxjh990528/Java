package Homework.Manage;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 14:02
 * @Java version: 1.8.0_361
 * @Description:作业一:在上课练习，学生类[Student]，员工类[Emp]，人类[Person]的基上实现以下管理系统【实现添加学生，员工功能，实现显示所有信息】
 * 实现思路 :定义一个管理类[Manage]
 *          在管理类中定义人类的数组存放所有学生和员工
 *          Person []plist=new Person[10];
 *          实现以下方法:addPerson（）实现学生添加
 *                      selectPersons()实现显示所有
 */
//学生类
public class Student extends Person{
    private int stu_id; //学号

    Scanner scanner = new Scanner(System.in);

    public Student() {
        System.out.println("Constructing a student...");
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void addStudent(){
        System.out.println("录入添加学生信息>>>");
        System.out.print("请输入学号：");
        setStu_id(scanner.nextInt());
        System.out.print("请输入姓名：");
        super.setName(scanner.next());
        System.out.print("请输入年龄：");
        super.setAge(scanner.nextInt());
        System.out.println("添加成功！");
    }

    @Override
    public void selectPerson() {
        System.out.println("该对象为学生");
        System.out.println("学号为：" + this.getStu_id());
        super.selectPerson();

    }
}

