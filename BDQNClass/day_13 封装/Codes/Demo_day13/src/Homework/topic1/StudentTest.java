package Homework.topic1;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 10:36
 * @Java version: 1.8.0_361
 * @Description:1.编写一个类Student,代表学员，要示如下。
 * 具有属性：姓名，年龄        公有属性
 * 具有方法：自我介绍，负责输出该学员的姓名，年龄。
 * 编写测试类StudentTest进行测试，创建学生对象，在给属性进行赋值显示。
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 19;
        student.show();
    }
}
