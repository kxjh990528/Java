package Homework.Manage;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 14:49
 * @Java version: 1.8.0_361
 * @Description:作业一:在上课练习，学生类[Student]，员工类[Emp]，人类[Person]的基上实现以下管理系统【实现添加学生，员工功能，实现显示所有信息】
 * 实现思路 :定义一个管理类[Manage]
 *          在管理类中定义人类的数组存放所有学生和员工
 *          Person []plist=new Person[10];
 *          实现以下方法:addPerson（）实现学生添加
 *                      selectPersons()实现显示所有
 */
//员工类
public class Emp extends Person{

    private int job_id; //工号

    Scanner scanner = new Scanner(System.in);

    public Emp() {
        System.out.println("Constructing a Employee...");
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public void addEmp(){
        System.out.println("录入添加员工信息>>>");
        System.out.print("请输入工号：");
        this.setJob_id(scanner.nextInt());
        System.out.print("请输入姓名：");
        super.setName(scanner.next());
        System.out.print("请输入年龄：");
        super.setAge(scanner.nextInt());

        System.out.println("添加成功！");

    }

    @Override
    public void selectPerson() {
        System.out.println("该对象为员工");
        System.out.println("工号为：" + this.getJob_id());
        super.selectPerson();

    }
}
