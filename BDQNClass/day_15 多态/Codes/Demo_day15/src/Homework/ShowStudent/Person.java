package Homework.ShowStudent;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 11:51
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public abstract class Person {
    private String name;    //姓名
    private int age;    //年龄

    public Person(){}

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

    public abstract void show();
}
