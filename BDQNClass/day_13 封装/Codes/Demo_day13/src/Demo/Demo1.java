package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 10:15
 * @Java version: 1.8.0_361
 * @Description:上机练习一:
 * 定义一个学生类
 * //第一步:定义类
 * public class Student {
 *       //第二步:确定类的属性
 *       public int xh;  //学号
 *       public String name; //姓名
 *       public int age;  //年龄
 *       public String sex; //性别
 *
 *       //第三步:确定类的方法
 *       public void show(){
 *           System.out.println("学号是："+this.xh);
 *           System.out.println("姓名是："+this.name);
 *           System.out.println("年龄是："+this.age);
 *           System.out.println("性别是："+this.sex);
 *       }
 * }
 *
 * 要求一:创建对象时完成学生属性的初始化并显示.     先给孩子取名，再有对象
 *            借助构造(带参)
 *           2.	构造方法定义:
 * public 类名(参数列表){
 *    一般情况：完成属性的初始化工作…
 * }
 *  //定义带参构造
 *       public  Student(int xh,String name,int age,String sex){
 *           //一般实现属性的初始化工作
 *           this.xh=xh;
 *           this.name=name;
 *           this.age=age;
 *           this.sex=sex;
 *       }
 *
 * //创建对象
 *   Student stu2=new Student(101,"罗总",22,"女");
 *
 * 要求二:创建对象后赋值显示    先有孩子再取名
 *
 */
public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
    }

}
