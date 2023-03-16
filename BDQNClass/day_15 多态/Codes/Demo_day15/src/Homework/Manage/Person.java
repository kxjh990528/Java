package Homework.Manage;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 13:50
 * @Java version: 1.8.0_361
 * @Description:作业一:在上课练习，学生类[Student]，员工类[Emp]，人类[Person]的基上实现以下管理系统【实现添加学生，员工功能，实现显示所有信息】
 * 实现思路 :定义一个管理类[Manage]
 *          在管理类中定义人类的数组存放所有学生和员工
 *          Person []plist=new Person[10];
 *          实现以下方法:addPerson（）实现学生添加
 *                      selectPersons()实现显示所有
 */
public class Person {

    private  String name;   //姓名
    private  int age;   //年龄



    public Person() {
        System.out.println("Constructing a person...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void selectPerson(){
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
    };
}
