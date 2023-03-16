package Demo.Usb;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 10:29
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Test {
    public static void main(String[] args) {
        /*//测试Usb的工作原理
        Usb usb = new Mouse();
        usb.work();

        Person p=new Student(); //向上转型
        //instanceof判断对象是不是某类的对象
        System.out.println(p instanceof Person);//true
        System.out.println(p instanceof Student);//true
        System.out.println(p instanceof Emp); //false
        System.out.println(p instanceof Object);//true*/

        Person []ps = new Person[3];

        //存一个员工
        Student stu = new Student();
        stu.sut_id = 1;
        stu.name = "张三";
        stu.age = 19;
        ps[0] = stu;

        //存一个员工
        Emp emp=new Emp();
        emp.job_id = 201;
        emp.name = "李四";
        emp.age = 22;
        ps[1] = emp;
    }

}
