package Homework.topic3;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 12:14
 * @Java version: 1.8.0_361
 * @Description:3.编写有各类Student2代表学员，要求如下。[练构造]
 * 具有属性[私有属性]：姓名，年龄，性别和专业
 * 具有方法：自我介绍，负责输出该学员的姓名，年龄，性别和专业
 * 具有两个带参构造方法：在第一个构造方法中，设置学员性别为男，专业为Accp，其余属性的值由参数给定，在第二个构造方法中，所有属性的值都有参数给定，
 * 编写测试类Student2Test 进行，分别以两种方式完成对两个Student2对象初始化工作，并分别调用她们的自我介绍方法，看输出结果是否正确。
 */
public class Student2 {
    private  String name;   //姓名
    private  int age;   //年龄
    private String gender;  //性别
    private String major;   //专业

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "男";
        this.major = "Accp";
    }

    public Student2(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void show(){
        System.out.println("姓名是：" + this.name);
        System.out.println("年龄是：" + this.age);
        System.out.println("性别是：" + this.gender);
        System.out.println("专业是：" + this.major);
        System.out.println();
    }
}
