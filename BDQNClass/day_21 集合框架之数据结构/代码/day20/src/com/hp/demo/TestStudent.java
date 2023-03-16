package com.hp.demo;

import java.util.HashMap;
import java.util.Set;

public class TestStudent {

    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

        //创建学生对象
        Student s1 = new Student("张三", 30);
        Student s2 = new Student("李四", 35);
        Student s3 = new Student("王五", 33);
        Student s4 = new Student("张三", 30);

        //把学生添加到集合
        hm.put(s1, "武汉");
        hm.put(s2, "北京");
        hm.put(s3, "上海");
        hm.put(s4, "深圳");

        //遍历集合
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
