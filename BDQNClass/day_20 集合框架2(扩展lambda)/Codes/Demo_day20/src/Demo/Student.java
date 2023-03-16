package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 12:07
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Student {
    public int xh;
    public String name;
    public int age;
    // 。。添加构造

    public Student() {
    }

    public Student(int xh, String name, int age) {
        this.xh = xh;
        this.name = name;
        this.age = age;
    }

    public int getXh() {
        return xh;
    }

    public void setXh(int xh) {
        this.xh = xh;
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

    public void show(){
        System.out.println("学号是："+xh);
        System.out.println("姓名是："+name);
        System.out.println("年龄是："+age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "xh=" + xh +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
