package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 10:16
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Student {
    public int id;  //学号
    public String name; //姓名
    public int age;  //年龄
    public String sex; //性别

    public void show(){
        System.out.println("学号是：" + this.id);
        System.out.println("姓名是：" + this.name);
        System.out.println("年龄是：" + this.age);
        System.out.println("性别是：" + this.sex);
    }

    /*public Student(int id,String name,int age,String sex){
        //一般实现属性的初始化工作
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }*/
    public Student(){

    }
}
