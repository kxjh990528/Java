package Homework.topic2;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 10:38
 * @Java version: 1.8.0_361
 * @Description:2.编写一个类Student1,代表学员，要求如下。[练封装]
 * 具有属性[私有属性]：姓名，年龄。
 * 具有方法：自我介绍，负责输出该学员的姓名，年龄。
 * 编写测试类Student2Test进行测试，创建学生对象，在给属性进行赋值显示。
 */
public class Student2Test {
    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.setName("张三");
        student2.setAge(19);
        //student2.show();
        System.out.println("姓名是：" + student2.getName() + "\n年龄是：" + student2.getAge());
    }
}
