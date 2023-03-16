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

    public Student(int xh, String name, int age) {
        this.xh = xh;
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("学号是："+xh);
        System.out.println("姓名是："+name);
        System.out.println("年龄是："+age);
    }
}
