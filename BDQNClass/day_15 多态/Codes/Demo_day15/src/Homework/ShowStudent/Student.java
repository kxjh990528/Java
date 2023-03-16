package Homework.ShowStudent;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 11:54
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Student extends Person{
    private int sut_id;  //学号

    public Student() {
    }

    public int getSut_id() {
        return sut_id;
    }

    public void setSut_id(int sut_id) {
        this.sut_id = sut_id;
    }

    @Override
    public void show() {
        System.out.println("学生学号：" + this.getSut_id());
        System.out.println("学生姓名：" + super.getName());
        System.out.println("学生年龄：" + super.getAge());
    }
}
