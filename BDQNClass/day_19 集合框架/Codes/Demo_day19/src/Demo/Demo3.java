package Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 12:08
 * @Java version: 1.8.0_361
 * @Description:上机练习三: 使用泛集合存储多名学生信息并显示
 * */
public class Demo3 {
    public static void main(String[] args) {
        //1.创建集合对象
        List<Student> list = new ArrayList<Student>();
        //2.存学生对象----->类型不安全--解决-->泛型集合
        list.add(new Student(101,"张三",21));
        list.add(new Student(102,"刘总",23)); //字符串
        list.add(new Student(103,"李四",21));

    }
}
