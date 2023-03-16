package Demo.Usb;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 16:17
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Person {
    public String name; //姓名
    public int age; //年龄

    public Person() {
    }

    /*public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public void show(){
        System.out.println("姓名是：" + this.name);
        System.out.println("年龄是：" + this.age);
    }
}
