package Demo.Usb;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 16:20
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Student extends Person {
    public int sut_id;  //学号

    public Student() {
    }

    /*public Student(int sut_id, String name, int age) {
        super(name, age);
        this.sut_id = sut_id;
    }*/

    public void show(){
        //在子类中使用super关键字调用父类成员
        System.out.println("学号是：" + this.sut_id);
        //System.out.println("姓名是：" + super.name);
        //System.out.println("年龄是：" + super.age);
        super.show();
    }

}
