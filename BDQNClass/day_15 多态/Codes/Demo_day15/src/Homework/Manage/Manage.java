package Homework.Manage;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 15:12
 * @Java version: 1.8.0_361
 * @Description:作业一:在上课练习，学生类[Student]，员工类[Emp]，人类[Person]的基上实现以下管理系统【实现添加学生，员工功能，实现显示所有信息】
 * 实现思路 :定义一个管理类[Manage]
 *          在管理类中定义人类的数组存放所有学生和员工
 *          Person []plist=new Person[10];
 *          实现以下方法:addPerson（）实现学生添加
 *                      selectPersons()实现显示所有
 *
 *  学生
 * 效果如下:
 * 人员管理系统:
 * 1.添加人员  2.查询人员信息
 * 请输入功能:1
 * 请输入人员的职称(1.学生 2.员工):1
 * 请输入姓名:sss
 * 请输入年龄:111
 * 请输入学号:12          如果职啊是2：请输入工号
 * 添加成功
 */

//管理系统类
public class Manage {
    //输入对象 属性
    Scanner scanner = new Scanner(System.in);
    //成员数组10
    Person []plist = new Person[10];
    //记录总人数
    public int count = 0;

    public String flag = "";

    public void mainMenu(){
        System.out.println("人员管理系统");
        System.out.println("1.添加人员 2.查询人员信息 3.退出");
        System.out.println("请输入功能：");
        int choose = scanner.nextInt();
        do {
            switch (choose){
                case 1:
                    this.addPerson();
                    break;
                case 2:
                    this.selectPerson();
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("输入错误请重试！");
                    break;
            }
            //询问
            System.out.println("是否想继续操作(y|n)？");
            flag = scanner.next();
        }while (flag.equals("y"));
    }

    public void addPerson(){
        System.out.println("请选择输入的人员职称（1.学生 2.员工）：");
        int type = scanner.nextInt();
        if (type == 1){
            if (count >= plist.length){
                System.out.println("成员已满，请勿继续添加！");
                this.mainMenu();
            }else {
                Student student = new Student();
                student.addStudent();
                plist[count] = student;
                count++;
            }
        }else if (type == 2){
            if (count >= plist.length) {
                System.out.println("成员已满，请勿继续添加！");
            }else {
                Emp emp = new Emp();
                emp.addEmp();
                plist[count] = emp;
                count++;
            }
        }else {
            System.out.println("输入有误，请重新输入！");
            this.addPerson();
        }
        //询问
        System.out.println("是否想继续添加(y|n)？");
        String flag = scanner.next();
        if(flag.equals("y"))
            this.addPerson();
        else
            this.mainMenu();
    }

    public void selectPerson(){
        if (count == 0){
            System.out.println("还没添加任何成员，请先添加再使用");
            this.mainMenu();
        }else {
            for (int i = 0; i < plist.length; i++) {
                if (plist[i] instanceof Student){
                    Student stu = (Student) plist[i];
                    stu.selectPerson();
                }else if (plist[i] instanceof Emp){
                    Emp emp = (Emp)plist[i];
                    emp.selectPerson();
                }
            }
            this.mainMenu();
        }

    }

}
