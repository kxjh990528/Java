package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 15:45
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//定义的学生类型
public class Student {
    //定义属性
    public int ID; //学号
    public String name; //姓名
    public String sex; //性别
    public int age;  //年龄

    //定义一个show方法显示信息
    public void show(){
        System.out.println("学号:" + this.ID);
        System.out.println("姓名:" + this.name);
        System.out.println("年龄:" + this.age);
        System.out.println("性别:" + this.sex);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //3.使用对象数组:存三名学生信息，并输出信息
        //数据类型  [] 数组名=new 数据类型[长度];
        Student [] students=new Student[3];

        //3.1输入三个学生信息存入数组
        for (int i = 0;i < students.length; i++){
            System.out.println("请输入第"+(i+1)+"个学生信息");
            //创建一个学生对象
            Student stu = new Student();
            System.out.print("请输入学号:");
            stu.ID = input.nextInt();
            System.out.print("请输入姓名:");
            stu.name = input.next();
            System.out.print("请输入年龄:");
            stu.age = input.nextInt();
            System.out.print("请输入性别:");
            stu.sex = input.next();
            //将学生存入数组
            students[i] = stu;
        }

        //3.2输出学生信息
        for (int i = 0; i < students.length ; i++) {
            Student s = students[i];
            s.show();
            System.out.println();
        }
    }
}