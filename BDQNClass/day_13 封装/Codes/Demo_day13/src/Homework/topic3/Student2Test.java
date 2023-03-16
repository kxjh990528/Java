package Homework.topic3;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 13:51
 * @Java version: 1.8.0_361
 * @Description:3.编写有各类Student2代表学员，要求如下。[练构造]
 * 具有属性[私有属性]：姓名，年龄，性别和专业
 * 具有方法：自我介绍，负责输出该学员的姓名，年龄，性别和专业
 * 具有两个带参构造方法：在第一个构造方法中，设置学员性别为男，专业为Accp，其余属性的值由参数给定，在第二个构造方法中，所有属性的值都有参数给定，
 * 编写测试类Student2Test 进行，分别以两种方式完成对两个Student2对象初始化工作，并分别调用她们的自我介绍方法，看输出结果是否正确。
 */
public class Student2Test {
    public static void main(String[] args) {
        Student2 stu1 = new Student2("张三", 18);
        stu1.show();
        Student2 stu2 =new Student2("李四", 19, "男", "Java");
        stu2.show();
    }
}
