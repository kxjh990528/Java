package Demo.StudentManageSystem;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 20:05
 * @Java version: 1.8.0_361
 * @Description:项目需求:学生管理系统
 * 功能：
 * 1.添加功能  2.查询学生   3.退出
 * 2.查询学生分为:1.按姓名查询  2.显示所有  3.返回
 * 效果:
 * 1.添加功能  2.查询学生 3.退出     一级菜单
 * 请选择功能:2
 * 1.按姓名查询  2.显示所有  3.返回    二级菜单
 * 实现学生管理系统类StudentManager:
 */
public class StudentManger {
    //输入对象 属性
    Scanner input = new Scanner(System.in);
    //定义学生数组用于存储学生信息: 10
    Student [] stulist = new Student[10];
    //控制学生人数
    int count = 0;

    //主菜单
    public void mainMenu(){
        System.out.println("\t\t欢迎使用学生管理系统");
        System.out.println("\t1.添加学生  2.查询学生 3.退出 4.办理休学");
        System.out.print("请选择功能:");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                this.addStudent();
                break;
            case 2:
                this.secondMenu();
                break;
            case 3:
                //退出退出
                System.exit(1);
                break;
            case 4:
                System.out.println("办理休学");
                break;
            default:
                System.out.println("输入有误，请重新输入");
                this.mainMenu();
                break;
        }
    }

    //二级菜单
    public void secondMenu(){
        System.out.println("\t\t学生管理系统（二级菜单）");
        System.out.println("\t1.按姓名查找 2.显示所有 3.返回上级菜单 4.退出");
        System.out.print("请选择功能:");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                this.searchStudentByName();
                break;
            case 2:
                System.out.println("显示所有");
                break;
            case 3:
                this.mainMenu();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("输入有误，请重新输入");
                this.secondMenu();
                break;
        }
    }

    //功能一：添加学生
    public void addStudent(){
        if (count > stulist.length){
            System.out.println("学生数量已满，添加失败！");
            //return; //退出方法
            this.mainMenu();
        }else {
            System.out.println("录入添加学生信息>>>");
            Student student = new Student();
            System.out.print("请输入学生的学号：");
            student.id = input.nextInt();
            System.out.print("请输入学生的姓名：");
            student.name = input.next();
            System.out.print("请输入学生的年龄");
            student.age = input.nextInt();
            /*System.out.print("请输入学生在读状态（1 在读；0 休学）：");
            student.state = input.nextShort();*/
            //System.out.println("在读状态采用默认值0");
            student.state = 0;  //在读

            stulist[count] = student;   //将学生存入数组
            count ++;   //记录学生数量
            System.out.println("添加成功");

            //询问
            System.out.println("是否想继续添加(y|n)？");
            String flag = input.next();
            if(flag.equals("y"))
                addStudent();
            else
                this.mainMenu();
        }
    }
    //功能：按姓名查找
    public void searchStudentByName(){
        System.out.println(">>>请输入学生姓名:");
        String name=input.next();

        for (int i = 0; i < stulist.length; i++) {
            Student student = new Student();
            student = stulist[i];
            if (student != null && student.name.equals(name)){
                System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                        "\t在读状态：" + (student.state==0?"在读":"休学"));
            }
        }

        System.out.println("是否想返回上一级y|n");
        String flag=input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.secondMenu();
    }

    //功能：显示所有学生
    public void showAllStudents(){
        System.out.println(">>>显示所有学生信息:");
        for (int i = 0; i < stulist.length; i++) {
            Student student = new Student();
            student = stulist[i];
            System.out.println("第" + (i+1) + "个学生信息：");
            System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                    "\t在读状态：" + (student.state==0?"在读":"休学"));
        }

        System.out.println("是否想返回上一级y|n");
        String flag=input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.secondMenu();
    }
}
