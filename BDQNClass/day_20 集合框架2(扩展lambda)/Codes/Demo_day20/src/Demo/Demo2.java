package Demo;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 10:57
 * @Java version: 1.8.0_361
 * @Description:上机练习二:
 * 定义一个list集合存放多名学生
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义一个集合存放多名学生
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(101,"丰哥",28));
        list.add(new Student(102,"杰哥",18));
        list.add(new Student(103,"陈哥",33));
        list.add(new Student(104,"罗总",20));

        //要求:list集合中的学生按年龄排序(升序)
        //排序--利用对象的某个属性值排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //大于0就换，小于0就不换
                return o1.age - o2.age;
            }
        });

        //Collections.reverse(list);

        //排序后
        for (Student s:list) {
            System.out.println(s.toString());
        }
        System.out.println();

        System.out.println("lambda");
        //2.利用foreach方法结合lambda表达式循坏
        list.forEach((Student student)-> {  //循环代表一个值
                    System.out.println(student.toString());
                }
        );
        System.out.println();
        Stream<Student> result=list.stream().filter(s-> {
            return s.age>26 && s.name.indexOf("哥")!=-1;  //满足条件就筛选
        });
        result.forEach(student -> {
                    System.out.println(student.toString());
                }
        );
    }
}
