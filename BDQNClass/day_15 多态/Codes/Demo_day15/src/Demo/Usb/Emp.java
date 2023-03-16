package Demo.Usb;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 16:23
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Emp extends Person{
    public int job_id;

    public void show(){
        //在子类中使用super关键字调用父类成员
        System.out.println("学号是：" + this.job_id);
        //System.out.println("姓名是：" + super.name);
        //System.out.println("年龄是：" + super.age);
        super.show();
    }
}
